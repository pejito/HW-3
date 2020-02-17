
public class Washer implements Runnable{

	private String sockColor = Thread.currentThread().getName();
	
	public Washer(String sockColor) {
		this.sockColor = sockColor;
	}
	
	@Override
	public void run() {
		System.out.println("Destroyed " + sockColor + " socks");
	}

}
