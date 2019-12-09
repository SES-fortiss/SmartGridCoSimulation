package linprogMPC.components;

import java.util.HashSet;
import java.util.List;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

public class NodeSpace {

	private HashSet<String> childrenNameList;
	private List<NodeId> childList;

	public NodeSpace(HashSet<String> childrenNameList) {
		this.childrenNameList = childrenNameList;
			
	}

	
	
	public String getChildNames() {

		String childString = "Consumption";
		
		for (String childName : childrenNameList) {


			if (!"Consumption".equals(childName)) {
	//		if(childName.replace("\n", "").replace("\r", "") != "Consumption") {
				childString = childString + " " + childName.substring(0, childName.length() - 1);
			}
		}
			
		return childString;
	}
	



	public List<NodeId> getInputNodes() {
		
		/*  ======== Identifiers =====
		 *  (fortiss Server Beispiel)
		 *  
		 *  Producer:			 2
		 *  Volatile Producer: 	14
		 *  Coupler:			21
		 *  Storage				22
		 *  
		 */
		
		for (String childName : childrenNameList) {
			
			childName = childName.replace("\n", "").replace("\r", "");
			switch(childName.substring(childName.length() - 1)) {
			
				case "SolarThermic":
					childList.add(new NodeId(2, 14));

				case "GasBoiler":
					childList.add(new NodeId(2, 2));
					
				case "OilBoiler":
					childList.add(new NodeId(2, 2));
					
				case "CHP":
					childList.add(new NodeId(2, 21));
					
				case "HeatPump":
					childList.add(new NodeId(2, 21));
					
				case "Battery":
					childList.add(new NodeId(2, 22));
					
				case "ThermalStorage":
					childList.add(new NodeId(2, 22));
					
				case "PV":
					childList.add(new NodeId(2, 14));
					
				case "Consumption":

			}
		}
		
		return childList;
	}
	
	
	


	

}
