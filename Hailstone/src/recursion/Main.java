package recursion;
import java.math.BigInteger;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Hail hell = new Hail();
			String BigNum = JOptionPane.showInputDialog("Where we startin?");
			hell.bigBlackMagic(new BigInteger(BigNum));
			String outputS = "";
			outputS += "Stats: "+ "\n";
			outputS += " - Iterations: " + hell.getIterations().toString() + "\n";
			outputS += " - Max Reached: " + hell.getMaxReached().toString() + "\n";
			JOptionPane.showMessageDialog(null, outputS);
		} catch (Exception e){}
	}

}
