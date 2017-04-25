package testPackage;

/**
 * Final variables are constants.  Final variables should always
 * be ALL CAPS.
 * 
 * Can be initialized when declared, or in constructor.
 * @author gnguy
 *
 */
public class Final {
	private int sum;
	private final int NUMBER;
	
	public Final(int finalNum){
		NUMBER = finalNum;
	}
	
	public void add(){
		sum+=NUMBER;
	}
	
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
}
