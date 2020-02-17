//import java.util.Random;

public class electedOfficial implements Runnable{
	private static double thoughtValue;
	//private String thought;
	//private String actualLeader;
	//private double actualValue;
	
	public electedOfficial(double thoughtValue){
		this.thoughtValue = thoughtValue;
		//this.thought = thought;
	}
	@Override
	public synchronized void run() {
			System.out.println("This elected official has value " + thoughtValue);
			System.out.println("I'm the leader");
	}
	
	public static synchronized double getThoughtVal(){
		return thoughtValue;
	}
}

	


