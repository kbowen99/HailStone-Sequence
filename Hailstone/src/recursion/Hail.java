package recursion;
import java.math.BigInteger;

public class Hail {
	
	BigInteger iterations = new  BigInteger("0");
	BigInteger maxReached = new BigInteger("0");
	
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
	
	public BigInteger bigBlackMagic(BigInteger n){
		System.out.print(n + ", ");
		iterations = iterations.add(BigInteger.ONE);
		
		if (n.compareTo(maxReached) > 0){
			maxReached = n;
		}
		
		if (n.equals(BigInteger.ONE)){
			return n;
		} else if (n.mod(new BigInteger("2")).equals(BigInteger.ZERO)) {
			return bigBlackMagic(n.divide(new BigInteger("2")));
		} else {
			return bigBlackMagic((n.multiply(new BigInteger("3"))).add(new BigInteger("1")));
		}
	}
	
	public BigInteger bigBlackMagic(String n){
		return bigBlackMagic(new BigInteger(n));
	}
	
	@Deprecated
	public BigInteger bigBlackMagic(int n){
		return bigBlackMagic(new BigInteger(Integer.toString(n)));
	}
	
	public BigInteger getIterations(){
		return iterations;
	}
	
	public BigInteger getMaxReached(){
		return maxReached;
	}
}
