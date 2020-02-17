import java.util.concurrent.Callable;

public class Matching implements Callable<Integer> {

	private int pairs;
	private String sockColor = Thread.currentThread().getName();
	private int totalSocks;
	
	public Matching(int pairs, String sockColor, int totalSocks) {
		this.pairs = pairs;
		this.sockColor = sockColor;
		this.totalSocks  = totalSocks;
	}
	
	public Integer call() throws Exception {
		System.out.println("Sending " + sockColor + " socks to washer");
		System.out.println("Total socks is " + totalSocks + " There are " + pairs + " pairs");
		return 0;
		
	}

}
