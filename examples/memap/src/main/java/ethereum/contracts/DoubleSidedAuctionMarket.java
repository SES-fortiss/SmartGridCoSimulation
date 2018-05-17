package ethereum.contracts;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.3.1.
 */
public class DoubleSidedAuctionMarket extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50604051602080611608833981016040525160008054600160a060020a03909216600160a060020a03199092169190911790556115b6806100526000396000f3006080604052600436106100da5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416630ac8dfbe81146100df5780632fe2c262146101125780633399e142146101335780634d03a9a5146101545780635a1b44381461016f57806365b3fbd8146101905780636632776f146101a5578063c7baa613146101ba578063cc6bee54146101db578063ce2a4a74146101f0578063d7c4c1aa1461021c578063d9e61b0e1461023d578063f283329314610271578063f7818c1f14610289578063fc81587a146102a4575b600080fd5b3480156100eb57600080fd5b50610100600160a060020a03600435166102b9565b60408051918252519081900360200190f35b61013160246004803582810192908201359181359182019101356102cb565b005b34801561013f57600080fd5b50610100600160a060020a036004351661075d565b34801561016057600080fd5b5061010060043560243561076f565b34801561017b57600080fd5b50610100600160a060020a03600435166107a1565b34801561019c57600080fd5b506101006107b3565b3480156101b157600080fd5b506101316107b9565b3480156101c657600080fd5b50610100600160a060020a036004351661086b565b3480156101e757600080fd5b5061010061087d565b3480156101fc57600080fd5b506101316024600480358281019290820135918135918201910135610883565b34801561022857600080fd5b50610131600160a060020a0360043516610c7e565b34801561024957600080fd5b50610255600435610cd0565b60408051600160a060020a039092168252519081900360200190f35b34801561027d57600080fd5b50610255600435610cf8565b34801561029557600080fd5b50610100600435602435610d06565b3480156102b057600080fd5b50610131610d14565b60096020526000908152604090205481565b6000806060806000806000808b8b808060200260200160405190810160405280939291908181526020018383602002808284378201915050505050508a8a80806020026020016040519081016040528093929190818152602001838360200280828437820191505050505050610341828261108b565b8015610351575061035182611092565b1561074d57600054600160a060020a0316158061037c575060005433600160a060020a039081169116145b1561074d5760009950600098505b8c8910156103cc578b8b8a81811061039e57fe5b905060200201358e8e8b81811015156103b357fe5b90506020020135028a019950888060010199505061038a565b6103d58a6110f5565b1561071957600654151561043757600098505b8c89101561042d57610422898f8f8281811061040057fe5b905060200201358e8e8d818110151561041557fe5b905060200201353261119a565b6001909801976103e8565b600689905561074d565b60065460405190808252806020026020018201604052801561047357816020015b610460611514565b8152602001906001900390816104585790505b509750600098505b6006548910156104f157600280548a90811061049357fe5b600091825260209091206040805180820191829052926002908102909201919082845b8154815260200190600101908083116104b6575050505050888a8151811015156104dc57fe5b6020908102909101015260019098019761047b565b600480548060200260200160405190810160405280929190818152602001828054801561054757602002820191906000526020600020905b8154600160a060020a03168152600190910190602001808311610529575b5050505050965060009550600094506006546000149350600092505b8315801561059c57508d8d8681811061057857fe5b90506020020135888781518110151561058d57fe5b60209081029190910101515111155b156105bb576006546001909601958614156105b657600193505b610563565b8380156105c55750825b151561070c575b8215801561060b5750838061060b575087868151811015156105ea57fe5b6020908102919091010151518e8e8781811061060257fe5b90506020020135105b1561064f576106378686018f8f8881811061062257fe5b905060200201358e8e89818110151561041557fe5b6001909401938c85141561064a57600192505b6105cc565b8315801561068f5750828061068f57508d8d8681811061066b57fe5b90506020020135888781518110151561068057fe5b60209081029190910101515111155b15610707576106ed85870189888151811015156106a857fe5b6020908102919091010151518a518b908a9081106106c257fe5b60209081029190910181015101518a518b908b9081106106de57fe5b9060200190602002015161119a565b60065460019096019586141561070257600193505b61064f565b6105bb565b600680548601905561074d565b604080518b815290517f99acc54e101466a3f2fc92be0b4926758d83f63857366560b1c97428587c42be9181900360200190a15b5050505050505050505050505050565b60086020526000908152604090205481565b600180548390811061077d57fe5b90600052602060002090600202018160028110151561079857fe5b01549150829050565b60076020526000908152604090205481565b60065481565b60008054600160a060020a031615806107e0575060005433600160a060020a039081169116145b156108685750600160a060020a033281166000908152600860205260408082208054908390559051909233169183156108fc02918491818181858888f19350505050158015610833573d6000803e3d6000fd5b506040805182815290517fa44c481d9597060b60221eb3f9f308baea20937d73872afad5a3a0ccedb445929181900360200190a15b50565b600a6020526000908152604090205481565b60055481565b60006060806000806000808a8a808060200260200160405190810160405280939291908181526020018383602002808284378201915050505050508989808060200260200160405190810160405280939291908181526020018383602002808284378201915050505050506108f8828261108b565b8015610908575061090882611092565b15610c6f57600054600160a060020a03161580610933575060005433600160a060020a039081169116145b15610c6f57600554151561099557600098505b8b89101561098b57610980898e8e8281811061095e57fe5b905060200201358d8d8d818110151561097357fe5b90506020020135326112db565b600190980197610946565b6005899055610c6f565b6005546040519080825280602002602001820160405280156109d157816020015b6109be611514565b8152602001906001900390816109b65790505b509750600098505b600554891015610a4f57600180548a9081106109f157fe5b600091825260209091206040805180820191829052926002908102909201919082845b815481526020019060010190808311610a14575050505050888a815181101515610a3a57fe5b602090810290910101526001909801976109d9565b6003805480602002602001604051908101604052809291908181526020018280548015610aa557602002820191906000526020600020905b8154600160a060020a03168152600190910190602001808311610a87575b50505050509650600095506000945060009350600092505b83158015610af657508c8c86818110610ad257fe5b905060200201358887815181101515610ae757fe5b60209081029190910101515111155b15610b1557600554600190960195861415610b1057600193505b610abd565b838015610b1f5750825b1515610c66575b82158015610b6557508380610b6557508786815181101515610b4457fe5b6020908102919091010151518d8d87818110610b5c57fe5b90506020020135105b15610ba957610b918686018e8e88818110610b7c57fe5b905060200201358d8d89818110151561097357fe5b6001909401938b851415610ba457600192505b610b26565b83158015610be957508280610be957508c8c86818110610bc557fe5b905060200201358887815181101515610bda57fe5b60209081029190910101515111155b15610c6157610c478587018988815181101515610c0257fe5b6020908102919091010151518a518b908a908110610c1c57fe5b60209081029190910181015101518a518b908b908110610c3857fe5b906020019060200201516112db565b600554600190960195861415610c5c57600193505b610ba9565b610b15565b60058054860190555b50505050505050505050505050565b600054600160a060020a03161580610ca4575060005433600160a060020a039081169116145b1561086857600160a060020a03166000908152600a602090815260408083208390556009909152812055565b6003805482908110610cde57fe5b600091825260209091200154600160a060020a0316905081565b6004805482908110610cde57fe5b600280548390811061077d57fe5b600080548190819081908190819081908190600160a060020a03161580610d49575060005433600160a060020a039081169116145b15611081576005541580610d5d5750600654155b15610d6f57610d6a6113ee565b611081565b60009750600096505b6001805489908110610d8657fe5b60009182526020822060029091020101549550610da386886114cd565b965060009450600188815481101515610db857fe5b60009182526020822060016002909202010154945092505b60065487108015610de057508385105b15610e1b57600280546001890198908110610df757fe5b60009182526020909120600290910201600101549490940193600190920191610dd0565b83851015610e2b57610d6a6113ee565b6002805485870393508391906000198a01908110610e4557fe5b6000918252602090912060029091020160010180549190910390555091925082918186035b86811015610f3f576002805482908110610e8057fe5b600091825260209091206002909102016001015460096000600484815481101515610ea757fe5b6000918252602080832090910154600160a060020a031683528201929092526040019020805490910190556002805487919083908110610ee357fe5b60009182526020909120600290910201600101540260076000600484815481101515610f0b57fe5b6000918252602080832090910154600160a060020a0316835282019290925260400190208054919091039055600101610e6a565b6000821115610f74578160028860019003985088815481101515610f5f57fe5b60009182526020909120600290910201600101555b84600a600060038b815481101515610f8857fe5b6000918252602080832090910154600160a060020a0316835282019290925260400181208054909201909155600380548789029260089290918c908110610fcb57fe5b6000918252602080832090910154600160a060020a0316835282019290925260400181208054909201909155851115611064577fff0f2aa3116e3e72a8f4a5a7560b5f9c0bbeb9fde42a8790c4c4f10c5fdec1a360038981548110151561102e57fe5b6000918252602091829020015460408051600160a060020a03909216825291810188905280820189905290519081900360600190a15b60055488600101985088101561107957610d78565b6110816113ee565b5050505050505050565b5190511490565b600060015b82518110156110ea5782818151811015156110ae57fe5b9060200190602002015183600183038151811015156110c957fe5b9060200190602002015111156110e257600091506110ef565b600101611097565b600191505b50919050565b600160a060020a033316600090815260086020526040812054340182111561111f57506000611195565b8134111561114957600160a060020a03321660009081526008602052604090208054348490030190555b3482111561117357600160a060020a03321660009081526008602052604090208054348403900390555b50600160a060020a033216600090815260076020526040902080548201905560015b919050565b60025484101561122657604080518082019091528381526020810183905260028054869081106111c657fe5b90600052602060002090600202019060026111e292919061152f565b50806004858154811015156111f357fe5b9060005260206000200160006101000a815481600160a060020a030219169083600160a060020a031602179055506112d5565b6040805180820190915283815260208101839052600280546001810180835560008390529261127a929182027f405787fa12a823e0f2b7631cc41b3ba8828b3321ca811111fa75cd3aa3bb5ace019161152f565b5050600480546001810182556000919091527f8a35acfbc15ff81a39ae7d344fd709f28e8600b4aa8c65c6b64bfe7fe36bd19b01805473ffffffffffffffffffffffffffffffffffffffff1916600160a060020a0383161790555b50505050565b600154841015611334576040805180820190915283815260208101839052600180548690811061130757fe5b906000526020600020906002020190600261132392919061152f565b50806003858154811015156111f357fe5b604080518082019091528381526020810183905260018054808201808355600092909252909161138c9160029081027fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf601919061152f565b5050600380546001810182556000919091527fc2575a0e9e593c00f959f8c92f12db2869c3395a3b0502d05e2516446f71f85b018054600160a060020a03831673ffffffffffffffffffffffffffffffffffffffff1990911617905550505050565b6000805b6004548210156114bf576007600060048481548110151561140f57fe5b6000918252602080832090910154600160a060020a03168352820192909252604001812054600480549193506007918391908690811061144b57fe5b6000918252602080832090910154600160a060020a0316835282019290925260400181209190915560048054839260089290918690811061148857fe5b6000918252602080832090910154600160a060020a03168352820192909252604001902080549091019055600191909101906113f2565b505060006005819055600655565b6000815b600654811080156115005750836002828154811015156114ed57fe5b6000918252602082206002909102010154105b1561150d576001016114d1565b9392505050565b60408051808201825290600290829080388339509192915050565b826002810192821561155d579160200282015b8281111561155d578251825591602001919060010190611542565b5061156992915061156d565b5090565b61158791905b808211156115695760008155600101611573565b905600a165627a7a7230582097d902168f7101afdeb9ae4a321239dd924d8d655c9e28897223ad2efbf21f710029";

    protected DoubleSidedAuctionMarket(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected DoubleSidedAuctionMarket(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<LogDownPaymentTooLowEventResponse> getLogDownPaymentTooLowEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("LogDownPaymentTooLow", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<LogDownPaymentTooLowEventResponse> responses = new ArrayList<LogDownPaymentTooLowEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            LogDownPaymentTooLowEventResponse typedResponse = new LogDownPaymentTooLowEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.necessaryDownPayment = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<LogDownPaymentTooLowEventResponse> logDownPaymentTooLowEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("LogDownPaymentTooLow", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, LogDownPaymentTooLowEventResponse>() {
            @Override
            public LogDownPaymentTooLowEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                LogDownPaymentTooLowEventResponse typedResponse = new LogDownPaymentTooLowEventResponse();
                typedResponse.log = log;
                typedResponse.necessaryDownPayment = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<LogWithdrawalSuccessfulEventResponse> getLogWithdrawalSuccessfulEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("LogWithdrawalSuccessful", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<LogWithdrawalSuccessfulEventResponse> responses = new ArrayList<LogWithdrawalSuccessfulEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            LogWithdrawalSuccessfulEventResponse typedResponse = new LogWithdrawalSuccessfulEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<LogWithdrawalSuccessfulEventResponse> logWithdrawalSuccessfulEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("LogWithdrawalSuccessful", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, LogWithdrawalSuccessfulEventResponse>() {
            @Override
            public LogWithdrawalSuccessfulEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                LogWithdrawalSuccessfulEventResponse typedResponse = new LogWithdrawalSuccessfulEventResponse();
                typedResponse.log = log;
                typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();
                return typedResponse;
            }
        });
    }

    public List<LogOfferConfirmedEventResponse> getLogOfferConfirmedEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("LogOfferConfirmed", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(event, transactionReceipt);
        ArrayList<LogOfferConfirmedEventResponse> responses = new ArrayList<LogOfferConfirmedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            LogOfferConfirmedEventResponse typedResponse = new LogOfferConfirmedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.producer = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<LogOfferConfirmedEventResponse> logOfferConfirmedEventObservable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        final Event event = new Event("LogOfferConfirmed", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Uint256>() {}, new TypeReference<Uint256>() {}));
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, LogOfferConfirmedEventResponse>() {
            @Override
            public LogOfferConfirmedEventResponse call(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(event, log);
                LogOfferConfirmedEventResponse typedResponse = new LogOfferConfirmedEventResponse();
                typedResponse.log = log;
                typedResponse.producer = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.amount = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.price = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public RemoteCall<BigInteger> consumeWS(String param0) {
        final Function function = new Function("consumeWS", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> postDemand(List<BigInteger> demandFunctionPrices, List<BigInteger> demandFunctionAmounts, BigInteger weiValue) {
        final Function function = new Function(
                "postDemand", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(demandFunctionPrices, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(demandFunctionAmounts, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function, weiValue);
    }

    public RemoteCall<BigInteger> releasedPayments(String param0) {
        final Function function = new Function("releasedPayments", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> offers(BigInteger param0, BigInteger param1) {
        final Function function = new Function("offers", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> downPayments(String param0) {
        final Function function = new Function("downPayments", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> numDemands() {
        final Function function = new Function("numDemands", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> withdrawReleasedPayments() {
        final Function function = new Function(
                "withdrawReleasedPayments", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<BigInteger> produceWS(String param0) {
        final Function function = new Function("produceWS", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<BigInteger> numOffers() {
        final Function function = new Function("numOffers", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> postOffer(List<BigInteger> offerFunctionPrices, List<BigInteger> offerFunctionAmounts) {
        final Function function = new Function(
                "postOffer", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(offerFunctionPrices, org.web3j.abi.datatypes.generated.Uint256.class)), 
                new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Uint256>(
                        org.web3j.abi.Utils.typeMap(offerFunctionAmounts, org.web3j.abi.datatypes.generated.Uint256.class))), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> deleteWsFromPreviousClearing(String participant) {
        final Function function = new Function(
                "deleteWsFromPreviousClearing", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(participant)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> offerAddresses(BigInteger param0) {
        final Function function = new Function("offerAddresses", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<String> demandAddresses(BigInteger param0) {
        final Function function = new Function("demandAddresses", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteCall<BigInteger> demands(BigInteger param0, BigInteger param1) {
        final Function function = new Function("demands", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0), 
                new org.web3j.abi.datatypes.generated.Uint256(param1)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<TransactionReceipt> clearMarket() {
        final Function function = new Function(
                "clearMarket", 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<DoubleSidedAuctionMarket> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _parent) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent)));
        return deployRemoteCall(DoubleSidedAuctionMarket.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<DoubleSidedAuctionMarket> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _parent) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_parent)));
        return deployRemoteCall(DoubleSidedAuctionMarket.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static DoubleSidedAuctionMarket load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new DoubleSidedAuctionMarket(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static DoubleSidedAuctionMarket load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new DoubleSidedAuctionMarket(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class LogDownPaymentTooLowEventResponse {
        public Log log;

        public BigInteger necessaryDownPayment;
    }

    public static class LogWithdrawalSuccessfulEventResponse {
        public Log log;

        public BigInteger amount;
    }

    public static class LogOfferConfirmedEventResponse {
        public Log log;

        public String producer;

        public BigInteger amount;

        public BigInteger price;
    }
}
