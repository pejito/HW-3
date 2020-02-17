
public class matrix implements Runnable{
	private float[][] A;
	private float[][] B;
	private float[][] C;
	private int m; //width
	private int n; //height of starting/shared height
	private int p; //final height
	private int dimension;
	
	public matrix(float[][] A, float[][] B, float[][] C, int m, int n, int p) {
		this.A = A;
		this.B = B;
		this.C = C; 
		this.m = m;
		this.n = n;
		this.p = p;
	}
	@Override
	public void run() {
		System.out.println("Running multiplication thread ...");
		final long startTime = System.currentTimeMillis();
		float[][] C1 = new float[m][p];
		for(int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C1[i][j] += A[i][k] * B[k][j];
                }
            }
        }    
		/*
		System.out.println("\n\nResult:");
        for (int i = 0; i < C1.length; i++) {
            for (int j = 0; j < C1[i].length; j++) {
                System.out.print(C1[i][j]+" ");
            }
            System.out.println();
        }
        */
		final long endTime = System.currentTimeMillis();
		float sec = (endTime - startTime) / 1000F;
		System.out.println("Time to run using thread is " + sec);
	}
	/*
	public float[][] matMult(float[][] A, float[][] B, int m, int n, int p) {
		final long startTime = System.currentTimeMillis();
		float[][] C1 = new float[m][p];
		for(int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C1[i][j] += A[i][k] * B[k][j];
                }
            }
        }     
		final long endTime = System.currentTimeMillis();
		System.out.println("Time to run using thread is" + endTime); 
		return C1;	
	}
	*/
}
