import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ranked implements Runnable{
	private ArrayList<Double> holdVal;
	private Thread check;

	@Override
	public void run() {
			System.out.println("A new leader approaches");
	}
	
	public void newMax(ArrayList<Double> holdVal, Thread check) {
		double[] vals = new double[holdVal.size()];
		for (int i = 0; i < vals.length; i++) {
			vals[i] = holdVal.get(i);
		}
		Double max = vals[0]; 
        
        for (int i = 1; i < vals.length; i++) 
            if (vals[i] > max) {
                max = vals[i]; 
            }
	      check.notifyAll();
	      System.out.println("The new leader is the thread with " + max); 	
	}

}
