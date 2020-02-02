package memap.examples;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaMonitoredItem;
import org.eclipse.milo.opcua.sdk.client.api.subscriptions.UaSubscription;
import org.eclipse.milo.opcua.stack.core.types.enumerated.MonitoringMode;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoredItemCreateRequest;
import org.eclipse.milo.opcua.stack.core.types.structured.MonitoringParameters;
import org.eclipse.milo.opcua.stack.core.types.structured.ReadValueId;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.sdk.client.OpcUaClient;
import org.eclipse.milo.opcua.stack.core.AttributeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.DataValue;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.enumerated.TimestampsToReturn;
import org.slf4j.LoggerFactory;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import memap.helperOPCua.*;
import memap.components.*;
import memap.examples.*;
@SuppressWarnings("unused")
// This class connects to opc.tcp://10.10.10.52:48040(Sauter Server) to access the warm data points and writes them to json
public class SauterReader implements MemapClient{
	public static void main(String[] args) throws Exception {
        SauterReader example = new SauterReader();
        
        new OpcuaClient(example).run();
    } 

    @Override
    public void run(OpcUaClient client, CompletableFuture<OpcUaClient> future) throws Exception 
    {
        client.connect().get();
        NodeId node1 = NodeId.parse("ns=2;g=c8d9c5dc-5b12-4d18-b94a-b64e4b3db587");
        NodeId node2 = NodeId.parse("ns=2;g=86fa78ab-0ecf-4e4c-84a9-6412c1423f28");
        NodeId node3 = NodeId.parse("ns=2;g=4e5fe65a-112d-4383-8465-63433ba65e38");
        NodeId node4 = NodeId.parse("ns=2;g=4637a0ca-cee8-4847-8d60-acb826340c22");
        NodeId node5 = NodeId.parse("ns=2;g=fd99c725-ed91-4785-9daa-fec60f265c7e");
        DataValue dataValue1 = client.readValue(0.0,TimestampsToReturn.Neither,node1).get();
        DataValue dataValue2 = client.readValue(0.0,TimestampsToReturn.Neither,node2).get();
        DataValue dataValue3 = client.readValue(0.0,TimestampsToReturn.Neither,node3).get();
        DataValue dataValue4 = client.readValue(0.0,TimestampsToReturn.Neither,node4).get();
        DataValue dataValue5 = client.readValue(0.0,TimestampsToReturn.Neither,node5).get();
        //ExtensionObject xo = (ExtensionObject) dataValue.getValue().getValue();
        // Decoding a struct with custom DataType requires a DataTypeManager
        // that has the codec registered with it. OpcUaClient automatically
        // reads any DataTypeDictionary nodes present in the server upon
        // connecting and dynamically generates codecs for custom structures.
        //Object value = xo.decode(client.getDataTypeManager());
        try (FileWriter file = new FileWriter("C:/Users/apsara.murali-simha/Desktop/Sauter.json"))
        		{
        	file.write("Datenpunkte von Wärmemengenzählern:\n");
        	file.write("End point URL:"+ getEndpointUrl()+"\n");
        	file.write("Gebaüde 1:"+"Display Name:OBJ01_DZMW_UA_02_B108VL_akt");
        	file.write(dataValue1.toString()+"\n");
        	file.write("Gebaüde 2:"+"Display Name:OBJ02_DZMW_UA_02_B108VL_akt");
        	file.write(dataValue2.toString()+"\n");
        	file.write("Gebaüde 3:"+"Display Name:OBJ03_DZMW_UA_02_B108VL_akt");
        	file.write(dataValue3.toString()+"\n");
        	file.write("Gebaüde 4:"+"Display Name:OBJ04_DZMW_UA_02_B108VL_akt");
        	file.write(dataValue4.toString()+"\n");
        	file.write("Gebaüde 5:"+"Display Name:OBJ05_DZMW_UA_02_B108VL_akt");
        	file.write(dataValue5.toString()+"\n");
            file.flush();
        		}
        catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        future.complete(client);
    }
    @Override
    public String getEndpointUrl() {
        // Change this if UaCPPServer is running somewhere other than localhost.
        return "opc.tcp://10.10.10.52:48040";
    }
	
	
	
	//Display name of data points with additional device efficiencies
    
	
	
	
	
}