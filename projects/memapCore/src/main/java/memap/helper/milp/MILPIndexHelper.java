package memap.helper.milp;

public class MILPIndexHelper {
	
	int controllableHandled = 0;
	int volatileHandled = 0;
	int couplerHandled = 0;
	int storageHandled = 0;
	int connectionHandled = 0;
	
	int nStepsMPC = 0;
	
	public MILPIndexHelper(int nStepsMPC) {
		this.nStepsMPC = nStepsMPC;
	}

}
