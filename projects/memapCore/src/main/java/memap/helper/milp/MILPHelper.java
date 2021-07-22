package memap.helper.milp;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;
import memap.messages.planning.ConnectionMessage;
import memap.messages.planning.CouplerMessage;
import memap.messages.planning.ProducerMessage;
import memap.messages.planning.StorageMessage;

public abstract class MILPHelper {
	
	public static void addControllableToProblem(ProducerMessage producerMessage, LpSolve optProblem, MILPIndexHelper ih) throws LpSolveException {		
		int nStepsMPC = ih.nStepsMPC;
		int addon = nStepsMPC * (ih.controllableHandled*2 + ih.volatileHandled + ih.couplerHandled*2 + ih.storageHandled*2 + ih.connectionHandled*2);
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + addon;			
			String string1 = producerMessage.name + "_T" + i;
			String string2 = producerMessage.name + "_OFF_T" + i;
			optProblem.setColName(index, string1);
			optProblem.setColName(index + nStepsMPC, string2);
			optProblem.setBinary(index + nStepsMPC, true);
		}		
	}

	public static void addVolatileToProblem(ProducerMessage producerMessage, LpSolve optProblem, MILPIndexHelper ih) throws LpSolveException {				
		int nStepsMPC = ih.nStepsMPC;
		int addon = nStepsMPC * (ih.controllableHandled*2 + ih.volatileHandled + ih.couplerHandled*2 + ih.storageHandled*2 + ih.connectionHandled*2);
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + addon;
			String string1 = producerMessage.name + "_T" + i;
			optProblem.setColName(index, string1);
		}		
	}

	public static void addCouplerToProblem(CouplerMessage couplerMessage, LpSolve problem, MILPIndexHelper ih) throws LpSolveException {		
		int nStepsMPC = ih.nStepsMPC;
		int addon = nStepsMPC * (ih.controllableHandled*2 + ih.volatileHandled + ih.couplerHandled*2 + ih.storageHandled*2 + ih.connectionHandled*2);
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + addon;
			String string1 = couplerMessage.name + "_T" + i;
			String string2 = couplerMessage.name + "OFF_T" + i;
			// TODO: Implement check for duplicated names
			// NOTE: it should be everywhere checked then
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
			problem.setBinary(index + nStepsMPC, true);
		}		
	}

	public static void addStorageToProblem(StorageMessage storageMessage, LpSolve problem, MILPIndexHelper ih) throws LpSolveException {		
		int nStepsMPC = ih.nStepsMPC;
		int addon = nStepsMPC * (ih.controllableHandled*2 + ih.volatileHandled + ih.couplerHandled*2 + ih.storageHandled*2 + ih.connectionHandled*2);
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + addon;
			String string1 = storageMessage.name+"_Discharge_T" + i;
			String string2 = storageMessage.name+"_Charge_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
		}		
	}

	public static void addMarkets(LpSolve problem, MILPIndexHelper ih) throws LpSolveException {		
		int nStepsMPC = ih.nStepsMPC;
		int addon = nStepsMPC * (ih.controllableHandled*2 + ih.volatileHandled + ih.couplerHandled*2 + ih.storageHandled*2 + ih.connectionHandled*2);
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + addon;
			String string1 = "ElecBuy_T" + i;
			String string2 = "ElecSell_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
		}
	}

	public static void addConnectionToProblem(ConnectionMessage connectionMessage, LpSolve problem,	MILPIndexHelper ih) throws LpSolveException {		
		int nStepsMPC = ih.nStepsMPC;
		int addon = nStepsMPC * (ih.controllableHandled*2 + ih.volatileHandled + ih.couplerHandled*2 + ih.storageHandled*2 + ih.connectionHandled*2);
		
		for (int i = 0; i < nStepsMPC; i++) {			
			int index = i + 1 + addon;
			String string1 = connectionMessage.name + "Frwd_T" + i;
			String string2 = connectionMessage.name + "Back_T" + i;
			problem.setColName(index, string1);
			problem.setColName(index + nStepsMPC, string2);
		}		
	}
}
