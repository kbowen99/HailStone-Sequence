package recursion;
import java.math.BigInteger;

public class Hail {
	BigInteger iterations = new  BigInteger("0");
	BigInteger maxReached = new BigInteger("0");
	int seed = 0;
	
	public Hail(int tmpSeed){
		//Variable is passed in constructor out of laziness (less to keep track of in the StreetCred Method)
		this.seed = tmpSeed;
	}
	
	//Basic code is basic
	@Deprecated
	public int blackMagic(int n){
		System.out.print(n + ", ");
		if (n == 1){
			return n;
		} else if (n%2 == 0) {
			return blackMagic(n/2);
		} else {
			return blackMagic(3*n+1);
		}
	}
	
	//Go big or go home
	public BigInteger bigBlackMagic(BigInteger n){
		System.out.print(n + ", ");
		iterations = iterations.add(BigInteger.ONE);
		
		if (n.compareTo(maxReached) > 0){
			maxReached = n;
		}
		
		//aren't BigInts Fun?
		if (n.equals(BigInteger.ONE)){
			return n;
		} else if (n.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
			return bigBlackMagic(n.divide(new BigInteger("2")));
		} else {
			return bigBlackMagic((n.multiply(new BigInteger("3"))).add(new BigInteger("1")));
		}
	}
	
	//options
	public BigInteger bigBlackMagic(String n){
		return bigBlackMagic(new BigInteger(n));
	}
	
	//even lazier options
	public BigInteger bigBlackMagic(int n){
		return bigBlackMagic(new BigInteger(n + ""));
	}
	
	//Accessors VVVV
	
	public BigInteger getIterations(){
		return iterations;
	}
	
	public BigInteger getMaxReached(){
		return maxReached;
	}
	
	public int getConstructedSeed(){
		return seed;
	}
}
