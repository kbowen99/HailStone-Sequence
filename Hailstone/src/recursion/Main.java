package recursion;
import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		//Try-Catch to prevent stupid people
		try {
			//create HailStone Generator & get input
			Hail hell = new Hail(0);
			String BigNum = JOptionPane.showInputDialog("Where we startin?");
			
			//Option to actually run extra credit class
			if (BigNum.equals("EC")){
				StreetCred extraCredit = new StreetCred();
				extraCredit.earn(); //Everyones favorite method
			} else {
				//the original blackMagic Class is now deprecated and replaced by bigBlackMagic (using BigIntegers)
				hell.bigBlackMagic(new BigInteger(BigNum));
				String outputS = "";
				outputS += "Stats: "+ "\n";
				outputS += " - Iterations: " + hell.getIterations().toString() + "\n";
				outputS += " - Max Reached: " + hell.getMaxReached().toString() + "\n";
				JOptionPane.showMessageDialog(null, outputS);
			}
		} catch (Exception e){}
	}

}
