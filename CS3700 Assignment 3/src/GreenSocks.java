import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class GreenSocks implements Callable<Integer>{
	
	private int numSocks = ThreadLocalRandom.current().nextInt(1, 100 + 1);
	private int numOfNumSocks = (ThreadLocalRandom.current().nextInt(1, numSocks + 1));
	
	
	public GreenSocks(int numSocks, int numOfNumSocks) {
		this.numSocks = numSocks;
		this.numOfNumSocks = numOfNumSocks;
	}
	
	public Integer call() throws Exception{
		System.out.println("Green Sock: Produced " + numOfNumSocks + " out of " + numSocks + " socks");
		int pairs = 0;
		for( int i= 0; i < numOfNumSocks; i++) {
			if(i % 2 == 0) {
				pairs++;
			}
		}
		return pairs;
	}
}
