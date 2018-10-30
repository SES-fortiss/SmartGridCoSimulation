package opcMEMAP.serverConfigurationClassesJSON;

import org.eclipse.milo.opcua.sdk.core.AccessLevel;
import org.eclipse.milo.opcua.stack.core.Identifiers;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

public class MyVariableNode {
	
	public String accesslevel;
	public String datatype;
	public String description;
	public String displayName;
	public String nameSpace;
	public String nodeID;
	public String parentFolder;
	public String userAccessLevel;
	public String value;
	
	public double samplingInterval;
	public boolean historizing;	
	
	public Object getValueWithDataType() {
    	if(datatype.equals("Double"))
    	return Double.parseDouble(value);
    	else if(datatype.equals("Boolean"))
        	return Boolean.parseBoolean(value);
    	else if(datatype.equals("Integer"))
        	return Integer.parseInt(value);
    	else if(datatype.equals("Float"))
        	return Float.parseFloat(value);
    	else 
        	return value;
    }
	
    public int getAccessLevelAsInt() {    	
    	if(accesslevel.equals("READ_WRITE")) 
    		return AccessLevel.getMask(AccessLevel.READ_WRITE);
    	else if(accesslevel.equals("READ_ONLY")) 
    		return AccessLevel.getMask(AccessLevel.READ_ONLY);
    	else if(accesslevel.equals("CurrentWrite"))
        	return AccessLevel.getMask(AccessLevel.CurrentWrite);
    	else 
        	return AccessLevel.getMask(AccessLevel.NONE);
    }
    
    public NodeId getDataType() {
    	if(datatype.equals("Double"))
    	return Identifiers.Double;
    	else if(datatype.equals("Boolean"))
        	return Identifiers.Boolean;
    	else if(datatype.equals("Integer"))
        	return Identifiers.Integer;
    	else if(datatype.equals("Float"))
        	return Identifiers.Float;
    	else 
        	return Identifiers.String;
    }

    public Double getMinSamplingInterval() {
    	return this.samplingInterval;
    }
    
    public Boolean isHistorizing() {
    	return this.historizing;
    }

}
