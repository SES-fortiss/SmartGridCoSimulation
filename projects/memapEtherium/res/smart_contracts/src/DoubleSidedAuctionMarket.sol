pragma solidity ^0.4.23;

contract DoubleSidedAuctionMarket {
    
    uint8 constant PRICE = 0; //index for prices in function point tuples for better readability
    uint8 constant AMOUNT = 1; //index for amounts in function point tuples for better readability
//    uint constant INFINITY = 0; //uint that represents infinite amounts
    
    event LogDownPaymentTooLow(uint necessaryDownPayment);
    event LogWithdrawalSuccessful(uint amount);
    event LogOfferConfirmed(address producer, uint amount, uint price);
    
    address parent;
    uint[2][] public offers;
    uint[2][] public demands;
    address[] public offerAddresses;
    address[] public demandAddresses;
    uint public numOffers;
    uint public numDemands;
    
    mapping(address => uint) public downPayments;
    mapping(address => uint) public releasedPayments;
    mapping(address => uint) public consumeWS;
    mapping(address => uint) public produceWS;
    
    /**
     * @param _parent parent market contract, e.g. IntegratedEnergyMarket. If 0,
     *      there is no parent and all functions can be accessed from everyone
     * */
    constructor(address _parent) public {
        parent = _parent;
    }
   
    modifier onlyValidFunction(uint[] functionPrices, uint[] functionAmounts) {
        if (isEqualLength(functionPrices, functionAmounts)
            && isSortedAscending(functionPrices)
//            && infinteAmountOnlyAtEnd(functionAmounts)
        ) {
            _;
        }
    }
    
    modifier onlyParent() {
        if(parent == 0 || msg.sender == parent) {
            _;
        }
    }
   
    /**
     * Post a new offer function by providing the price and amount coordinates.
     * First amount will be tried to sell for at least first price and so on,
     * second for second and so on.
     * 
     * @param prices price coordinates of function, needs to be ascending
     * @param amounts amount coordinates of function
     * 
     * */
    function postOffer(uint[] prices, uint[] amounts)
        external
        onlyValidFunction(prices, amounts)
        onlyParent
    {
        if(numOffers == 0) {
            for(uint i = 0; i < prices.length; i++) {
                insertOffer(i, prices[i], amounts[i], tx.origin);
            }
            numOffers = i;
            return;
        }
        //TODO put after first loop... unfortunately new variable causes stack too deep
        uint[2][] memory oldOffers = new uint[2][](numOffers);
        for(i = 0; i < numOffers; i++) {
            oldOffers[i] = offers[i];
        }
        address[] memory oldAddresses = offerAddresses;
        uint oldIndex = 0;
        uint newIndex = 0;
        bool oldOffersDone = false;
        bool newOffersDone = false;
        while(!oldOffersDone &&
            oldOffers[oldIndex][PRICE] <= prices[newIndex]
        ) {
            oldIndex++;
            if(oldIndex == numOffers) {
                oldOffersDone = true;
            }
        }
        while(!(oldOffersDone && newOffersDone)) {
            while(!newOffersDone &&
                (oldOffersDone ||
                    prices[newIndex] < oldOffers[oldIndex][PRICE]
                )
            ) {
                insertOffer(
                    oldIndex+newIndex,
                    prices[newIndex],
                    amounts[newIndex],
                    tx.origin
                );
                newIndex++;
                if(newIndex == prices.length) {
                    newOffersDone = true;
                }
            }
            while(!oldOffersDone &&
                (newOffersDone ||
                    oldOffers[oldIndex][PRICE] <= prices[newIndex]
                )
            ) {
                insertOffer(
                    oldIndex+newIndex,
                    oldOffers[oldIndex][PRICE],
                    oldOffers[oldIndex][AMOUNT],
                    oldAddresses[oldIndex]
                );
                oldIndex++;
                if(oldIndex == numOffers) {
                    oldOffersDone = true;
                }
            }
        }
        numOffers += newIndex;
    }
    
    /**
     * Post a new demand function by providing the price and amount coordinates.
     * First amount will be tried to sell for at most first price and so on,
     * second for second and so on. Down payments sufficient for paying for all
     * demands on the function need to be sent with the function. If payments have
     * aleready been released for the sender, those will also be considered for 
     * paying the down payment. LogDownPaymentTooLow will be emitted with
     * necessary down payment as parameter, if insufficient down payments are
     * provided.
     * 
     * @param prices price coordinates of function, needs to be ascending
     * @param amounts amount coordinates of function
     * 
     * */
    function postDemand(uint[] prices, uint[] amounts)
        external
        payable
        onlyValidFunction(prices, amounts)
        onlyParent
    {
        uint amountToPay = 0;
        
        for( i = 0; i < prices.length; i++) {
            amountToPay += prices[i] * amounts[i];
        }
        
        if(addDownPayment(amountToPay)) {
            if(numDemands == 0) {
                for(uint i = 0; i < prices.length; i++) {
                    insertDemand(i, prices[i], amounts[i], tx.origin);
                }
                numDemands = i;
                return;
            }
            uint[2][] memory oldDemands = new uint[2][](numDemands);
            for(i = 0; i < numDemands; i++) {
                oldDemands[i] = demands[i];
            }
            address[] memory oldAddresses = demandAddresses;
            uint oldIndex = 0;
            uint newIndex = 0;
            bool oldDemandsDone = numDemands == 0;
            bool newDemandsDone = false;
            while(
                !oldDemandsDone &&
                oldDemands[oldIndex][PRICE] <= prices[newIndex]
            ) {
                oldIndex++;
                if(oldIndex == numDemands) {
                    oldDemandsDone = true;
                }
            }
            while(!(oldDemandsDone && newDemandsDone)) {
                while(
                    !newDemandsDone && 
                    (
                        oldDemandsDone || 
                        prices[newIndex] < oldDemands[oldIndex][PRICE]
                    )
                ) {
                    insertDemand(
                        oldIndex+newIndex,
                        prices[newIndex],
                        amounts[newIndex],
                        tx.origin
                    );
                    newIndex++;
                    if(newIndex == prices.length) {
                        newDemandsDone = true;
                    }
                }
                while(
                    !oldDemandsDone && 
                    (
                        newDemandsDone || 
                        oldDemands[oldIndex][PRICE] <= prices[newIndex]
                    )
                ) {
                    insertDemand(
                        oldIndex+newIndex,
                        oldDemands[oldIndex][PRICE],
                        oldDemands[oldIndex][AMOUNT],
                        oldAddresses[oldIndex]
                    );
                    oldIndex++;
                    if(oldIndex == numDemands) {
                        oldDemandsDone = true;
                    }
                }
            }
            numDemands += newIndex;
            
        }
        else {
            emit LogDownPaymentTooLow(amountToPay);
        }
    }
   
    /**
     * Withdraw payments that have been released for withdrawal for sender account.
     * Will send the complete released paymentto sender and emit log event
     * LogWithdrawalSuccessful with withdrawn amount as parameter.
     *
     * */
    function withdrawReleasedPayments() external onlyParent {
        uint amount = releasedPayments[tx.origin];
        releasedPayments[tx.origin] = 0;
        tx.origin.transfer(amount);
        emit LogWithdrawalSuccessful(amount);
    }
    
    /**
     * Clears the market and fulfills as many demands as possible. Deletes all
     * stored offers and demands and releases down payments for all unmet demands
     * in preparation for next round.
     * */
     
    //TODO consider enabling array loops to be split onto multiple iterations
    //due to gas usage
    function clearMarket() external onlyParent { 
        
        if(numOffers == 0 || numDemands == 0) {
            prepareNextStep();
            return;
        }
        
        uint offerCount = 0;
        uint demandCount = 0;
        
        do {
            uint oldDemandCount = demandCount;
            uint currentPrice = offers[offerCount][PRICE];
            demandCount = skipDemandsWithTooLowPrice(currentPrice, demandCount);
            uint confirmedAmount = 0; 
            uint offeredAmount = offers[offerCount][AMOUNT];
            uint fittingDemands = 0;
            
            while(
                    demandCount < numDemands &&
                    (confirmedAmount < offeredAmount/* || offeredAmount == INFINITY*/)
            ) {
                confirmedAmount += demands[demandCount++][AMOUNT];
                fittingDemands++;
            }
            if(confirmedAmount < offeredAmount) {
                demandCount = oldDemandCount;
                //if clause neccesary do to issue https://github.com/ethereum/solidity/issues/4121
                if (++offerCount < numOffers && demandCount < numDemands) {
                    continue;
                }
                else {
                    prepareNextStep();
                    return;
                }
            }
            uint remainder = 0;
//            if(offeredAmount != INFINITY) {
                remainder = (confirmedAmount - offeredAmount);
                demands[demandCount - 1][AMOUNT] -= remainder;
 //           }
            confirmedAmount = 
                offeredAmount/*== INFINITY ? confirmedAmount : offeredAmount*/;
            for(uint i = demandCount-fittingDemands; i < demandCount; i++) {
                consumeWS[demandAddresses[i]] += demands[i][AMOUNT]; //TODO make safe for overflow
                downPayments[demandAddresses[i]] -= demands[i][AMOUNT] * currentPrice;
            }
            if(remainder > 0) {
                demands[--demandCount][AMOUNT] = remainder;
            }
                
            //TODO make safe for overflow
            produceWS[offerAddresses[offerCount]] += confirmedAmount;
            releasedPayments[offerAddresses[offerCount]] +=
                confirmedAmount * currentPrice; //TODO make safe for overflow
            if(confirmedAmount > 0) {
                emit LogOfferConfirmed(
                    offerAddresses[offerCount],
                    confirmedAmount,
                    currentPrice
                );
            }
        } while(++offerCount < numOffers && demandCount < numDemands);
        prepareNextStep();
    } 

    function deleteWsFromPreviousClearing(address participant) external onlyParent {
        produceWS[participant] = 0;
	consumeWS[participant] = 0;
    }
    
    function skipDemandsWithTooLowPrice(uint currentPrice, uint demandCount)
        internal
        view
        returns (uint)
    {
        uint newDemandCount = demandCount;
        while(
            newDemandCount < numDemands &&
            demands[newDemandCount][PRICE] < currentPrice
        ) {
            newDemandCount++;
        }
        return newDemandCount;
    }
   
    function prepareNextStep() internal {
        for(uint i = 0; i < numDemands; i++) {
            uint amount = downPayments[demandAddresses[i]];
            downPayments[demandAddresses[i]] = 0;
            releasedPayments[demandAddresses[i]] += amount;
        }
        numOffers = 0;
        numDemands = 0;
    }
    
    function addDownPayment(uint amountToPay) internal returns (bool){
        if (amountToPay > (msg.value + releasedPayments[tx.origin])) {
            releasedPayments[tx.origin] += msg.value;
            return false;
        }
        if(msg.value > amountToPay) {
            //TODO make safe for overflow
            releasedPayments[tx.origin] += msg.value - amountToPay; 
        }
        if(amountToPay > msg.value) {
            releasedPayments[tx.origin] -= amountToPay - msg.value;
        }
        downPayments[tx.origin] += amountToPay;  //TODO make safe for overflow
        return true;
    }
    
    function insertOffer(
        uint atIndex,
        uint price,
        uint amount,
        address fromAddress
    ) internal {
        if(atIndex < offers.length) {
            offers[atIndex] = [price, amount];
            offerAddresses[atIndex] = fromAddress;
        }
        else {
            offers.push([price, amount]);
            offerAddresses.push(fromAddress);
        }
    }

    function insertDemand(
        uint atIndex,
        uint price,
        uint amount,
        address fromAddress
    ) internal {
        if(atIndex < demands.length) {
            demands[atIndex] = [price, amount];
            demandAddresses[atIndex] = fromAddress;
        }
        else {
            demands.push([price, amount]);
            demandAddresses.push(fromAddress);
        }
    }
   
    function isEqualLength(uint[] firstArray, uint[] secondArray)
        internal
        pure
    returns (bool) {
        return firstArray.length == secondArray.length;
    }
   
    function isSortedAscending(uint[] array) internal pure returns (bool) {
        for(uint i = 1; i < array.length; i++) {
            if(array[i-1] > array [i]) {
               return false;
            }
        }
        return true;
    }
   
/*    function infinteAmountOnlyAtEnd(uint[] functionAmounts)
        internal
        pure
        returns (bool)
    {
        for(uint i = 0; i < functionAmounts.length - 1; i++) {
            if(functionAmounts[i] == INFINITY) {
                return false;
            }
       }
        return true;
   }
*/   
}
