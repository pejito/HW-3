import java.util.concurrent.Executors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class main {
	public static void main(String args[]) {
		
		int numOfSocks = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int numOfNumSocks = (ThreadLocalRandom.current().nextInt(1, numOfSocks + 1));
		
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		Future<Integer> blueSockPairs = executorService.submit(new BlueSocks(numOfSocks, numOfNumSocks));
		
		int numOfSocks1 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int numOfNumSocks1 = (ThreadLocalRandom.current().nextInt(1, numOfSocks + 1));
		Future<Integer> redSockPairs = executorService.submit(new RedSocks(numOfSocks1, numOfNumSocks1));
		
		int numOfSocks2 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int numOfNumSocks2 = (ThreadLocalRandom.current().nextInt(1, numOfSocks + 1));
		Future<Integer> greenSockPairs = executorService.submit(new GreenSocks(numOfSocks2, numOfNumSocks2));
		
		int numOfSocks3 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		int numOfNumSocks3 = (ThreadLocalRandom.current().nextInt(1, numOfSocks + 1));
		Future<Integer> orangeSockPairs = executorService.submit(new OrangeSocks(numOfSocks3, numOfNumSocks3));
		
		int totalSocks = numOfNumSocks + numOfNumSocks1 + numOfNumSocks2 + numOfNumSocks3;
		
		try {
			String sockColor = Thread.currentThread().getName();
			ExecutorService execServ = Executors.newSingleThreadExecutor();
			int a = blueSockPairs.get();
			int b = redSockPairs.get();
			int c = greenSockPairs.get();
			int d = orangeSockPairs.get();
			Future<Integer> match = execServ.submit(new Matching(a, sockColor, totalSocks));
			Future<Integer> match1 = execServ.submit(new Matching(b, sockColor, totalSocks));
			Future<Integer> match2 = execServ.submit(new Matching(c, sockColor, totalSocks));
			Future<Integer> match3 = execServ.submit(new Matching(d, sockColor, totalSocks));
			Thread washer = new Thread(new Washer(sockColor));
			washer.start();
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("Hey! Don't interrupt me! I'm getting values!");
		} 
		
		
		
		
		
		
		
		executorService.shutdown();
		
		
		
		/*Thread redThread = new Thread(new RedSocks());
		redThread.start();
		
		Thread bluethread = new Thread();
		bluethread.start();
		Thread greenThread = new Thread(new GreenSocks());
		greenThread.start();
		Thread orangeThread = new Thread(new OrangeSocks());
		orangeThread.start();
		*/		
		
	}
}

