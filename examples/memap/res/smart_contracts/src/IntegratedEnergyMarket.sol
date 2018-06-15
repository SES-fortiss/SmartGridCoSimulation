pragma solidity ^0.4.23;

import "./DoubleSidedAuctionMarket.sol";

contract IntegratedEnergyMarket {
    
    event LogNotAParticipant();
    
    DoubleSidedAuctionMarket public heatMarket;
    DoubleSidedAuctionMarket public electricityMarket;
    address[] participants;
    address timekeeper;
    
    /**
     * IntegratedEnergyMarket that forwards to DoubleSidedAuctionMarkets for 
     * heat and electricity. Only participants that are specified in constructor
     * are allowed to take part; if no participants are specified, everyone is 
     * allowed.
     * 
     * @param _timekeeper address that is allowed to start next time step
     * @param _participants list of participants. If empty, everyone is allowed 
     *                      to participate
     * */
    constructor(address _timekeeper, address[] _participants)
        public
    {
        timekeeper = _timekeeper;
        heatMarket = new DoubleSidedAuctionMarket(this);
        electricityMarket = new DoubleSidedAuctionMarket(this);
        if(!(_participants.length == 0)) {
            for(uint i = 0; i < _participants.length; i++) {
                participants.push(_participants[i]);
            }
        }
    }
    
    modifier onlyParticipants() {
        uint i = 0;
        if(participants.length == 0) {
            _;
        }
        while(i < participants.length) {
            if(participants[i++] == msg.sender) {
                _;
            }
        }
        emit LogNotAParticipant();
    }
    
    modifier onlyTimeKeeper() {
        if(msg.sender == timekeeper)
            _;
    }
    
    function postHeatOffer(uint[] prices, uint[] amounts)
        external
        onlyParticipants
    {
        heatMarket.postOffer(prices, amounts);
    }
    
    function numHeatOffers()
        external
        view
        returns (uint)
    {
        return heatMarket.numOffers();
    }
    
    function postHeatDemand(uint[] prices, uint[] amounts)
        external
        payable
        onlyParticipants
    {
        heatMarket.postDemand.value(msg.value)(prices, amounts);
    }
    
    function numHeatDemands()
        external
        view
        returns (uint)
    {
        return heatMarket.numDemands();
    }
    
    function getHeatToProduce()
        external
        view
        returns (uint)
    {
        return heatMarket.produceWS(msg.sender);
    }
    
    function getHeatToConsume()
        external
        view
        returns (uint)
    {
        return heatMarket.consumeWS(msg.sender);
    }
    
    function postElectricityOffer(uint[] prices, uint[] amounts)
        external
        onlyParticipants
    {
        electricityMarket.postOffer(prices, amounts);
    }
    
    function numElectricityOffers()
        external
        view
        returns (uint)
    {
        return electricityMarket.numOffers();
    }
    
    function postElectricityDemand(uint[] prices, uint[] amounts)
        external
        payable
        onlyParticipants
    {
        electricityMarket.postDemand.value(msg.value)(prices, amounts);
    }
    
    function numElectricityDemands()
        external
        view
        returns (uint)
    {
        return electricityMarket.numDemands();
    }
    
    function getElectricityToProduce()
        external
        view
        returns (uint)
    {
        return electricityMarket.produceWS(msg.sender);
    }
    
    function getElectricityToConsume()
        external
        view
        returns (uint)
    {
        return electricityMarket.consumeWS(msg.sender);
    }
    
    function withdrawReleasedPayments() external onlyParticipants {
        heatMarket.withdrawReleasedPayments();
        electricityMarket.withdrawReleasedPayments();
    }
    
    function nextTimestep() external onlyTimeKeeper{
        for(uint i = 0; i < participants.length; i++) {
            heatMarket.deleteWsFromPreviousClearing(participants[i]);
            electricityMarket.deleteWsFromPreviousClearing(participants[i]);
        }
        heatMarket.clearMarket();
        electricityMarket.clearMarket();
    }
}
