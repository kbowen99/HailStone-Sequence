package recursion;
import java.math.BigInteger;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class StreetCred {
	//messy way to keep track of highest Value/Iteration (high val/iteration is related to num high val/iteration)
	ArrayList<BigInteger> highVal = new ArrayList<BigInteger>();
	ArrayList<String> numHighVal = new ArrayList<String>();
	ArrayList<BigInteger> highSteps = new ArrayList<BigInteger>();
	ArrayList<String> numHighSteps = new ArrayList<String>();
	
	public void earn() {
		//prep
		fillTheLists();
		Hail testing = new Hail(0);
		//test 1000 times
		for (int i = 1; i<1000; i++){
			testing = new Hail(i);
			testing.bigBlackMagic(i);
			compare(testing);
		}
		//document
		JOptionPane.showMessageDialog(null, statsOutput());
	}
	
	private void fillTheLists(){
		//add initial values to lists so compare method works
		highVal.add(BigInteger.ZERO);
		numHighVal.add("");
		highSteps.add(BigInteger.ZERO);
		numHighSteps.add("");
	}
	
	private void compare(Hail comp){
		//adds values for latest run based on comparison
		for(int i = 0; i<highVal.size(); i++){
			if(comp.maxReached.compareTo(highVal.get(i)) > 0){
				highVal.add(i, comp.getMaxReached());
				numHighVal.add(i, comp.getConstructedSeed() + "");
				break; 
			}
		}
		for(int i = 0; i<highSteps.size(); i++){
			if(comp.getIterations().compareTo(highSteps.get(i)) > 0){
				highSteps.add(i, comp.getIterations());
				numHighSteps.add(i, comp.getConstructedSeed() + "");
				break; 
			}
		}
	}
	
	private String statsOutput(){
		//attempts to nicely output required stats
		String tmpOut = "Stats: ";
		
		//5 Highest Vals
		tmpOut += "\n| 5 Highest |";
		for (int i = 0; i < 5; i++){
			tmpOut += "\n " + highVal.get(i) +  " @ Seed " + numHighVal.get(i);
		}
		//5 longest Vals
		tmpOut += "\n| 5 Longest Lengths |";
		for (int i = 0; i < 5; i++){
			tmpOut += "\n " + highSteps.get(i) +  " @ Seed " + numHighSteps.get(i);
		}
		return tmpOut;
	}
	
}
