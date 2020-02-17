import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void main(String args[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many threads? ");
		int numThreads = sc.nextInt();	
		ArrayList<Double> holdVals = new ArrayList<Double>();
		ranked ranker = new ranked();
		Thread rank = new Thread(ranker);
		
		int counter = 0;
		
	while(counter < numThreads) {
		synchronized(rank) {
			double electedThoughtValue1 = Math.random();
			Thread th1  = new Thread(new electedOfficial(electedThoughtValue1));
			th1.start();
			th1.join();
			double x = electedOfficial.getThoughtVal();
			holdVals.add(x);
			rank.interrupt();
			counter++;
			try {
				rank.wait();
			}catch(InterruptedException e) {
				rank.start();
				ranker.newMax(holdVals, rank);
			}	
		}
			
		}
	}
		
}

		/*
		
		try {
			for(int i =0; i < numThreads; i++) {
				double electedThoughtValue1 = Math.random();
	    		holdThreads[i] = new Thread(new electedOfficial(electedThoughtValue1, rank));
	    		holdThreads[i].start();
	    		holdThreads[i].join();
			}
			
		}catch(InterruptedException e) {
			System.out.println("no");
			e.printStackTrace();
		}
			
	}
		
}

		/*	
		try {
			rank.interrupt();
			for(int i =0; i <= numThreads;i++) {
				double electedThoughtValue1 = Math.random();
	    		holdThreads[i] = new Thread(new electedOfficial(electedThoughtValue1));
	    		holdThreads[i].start();
	    		holdThreads[i].join();
	    		
			}	
		}catch(InterruptedException e) {
				rank.start();
	    		   //double val = electedOfficial.getThoughtVal();
	    		   System.out.println("workd");
	    		   rank.notifyAll();
			}
		}
		}
		*/
	         	 
	  
	

