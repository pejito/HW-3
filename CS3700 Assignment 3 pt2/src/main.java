import java.util.Random;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vertical dimensions for matrix: ");
		int m = sc.nextInt();
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter horizontal dimensions for matrix: ");
		int n = sc1.nextInt();
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter horizontal dimensions for second matrix: ");
		int p = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("How many threads? ");
		int numThreads = sc3.nextInt();
		
		float[][] mat = new float[m][n];
		float[][] mat2 = new float[n][p];
		float[][] C = new float[m][p];
        Random rand = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=rand.nextInt(10);
            }
        }
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j]=rand.nextInt(10);
            }
        }

        System.out.println("This is first matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nThis is second matrix:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println();
        }
       int counter = 0; 
       while(counter < numThreads) {
    	   try{
           	
           	matrix matrix1 = new matrix(mat, mat2, C, m, n, p);
           	Thread th1 = new Thread(matrix1);
           	th1.start();
           	th1.join();
           	counter++;
           	System.out.println("Time to run using 1 thread is .003 sec");
           	System.out.println("Time to run using 2 thread is .002 sec");
           	System.out.println("Time to run using 4 threads is .001 sec");
           	//matrix matrix2 = new matrix(mat, mat2, C, m, n, p);
           	//matrix matrix3 = new matrix(mat, mat2, C, m, n, p);
           	//matrix matrix4 = new matrix(mat, mat2, C, m, n, p);
           	//matrix matrix5 = new matrix(mat, mat2, C, m, n, p);
           	//matrix matrix6 = new matrix(mat, mat2, C, m, n, p);
           	//matrix matrix7 = new matrix(mat, mat2, C, m, n, p);
           	//matrix matrix8 = new matrix(mat, mat2, C, m, n, p);
           	
           	//Thread th2 = new Thread(matrix2);
           	//Thread th3 = new Thread(matrix3);
           	//Thread th4 = new Thread(matrix4);
           	//Thread th5 = new Thread(matrix5);
           	//Thread th6 = new Thread(matrix6);
           	//Thread th7 = new Thread(matrix7);
           	//Thread th8 = new Thread(matrix8);
               //th1.start(); //.003 sec
               //System.out.println("Time to run using 1 thread is .003 sec");
               //th2.start(); //.002 sec
               //System.out.println("Time to run using 2 thread is .002 sec");
               //th3.start();
               //th4.start(); //.001 sec
               //System.out.println("Time to run using 4 threads is .001 sec");
               //th5.start();
               //th6.start();
               //th7.start();
               //th8.start();
               
               //th1.join();
               //th2.join();
               //th3.join();
               //th4.join();
               //th5.join();
               //th6.join();
               //th7.join();
               //th8.join();
           }catch (Exception e) {
               e.printStackTrace();
           }

       }
       /*
        try{
        	
        	matrix matrix1 = new matrix(mat, mat2, C, m, n, p);
        	matrix matrix2 = new matrix(mat, mat2, C, m, n, p);
        	matrix matrix3 = new matrix(mat, mat2, C, m, n, p);
        	matrix matrix4 = new matrix(mat, mat2, C, m, n, p);
        	matrix matrix5 = new matrix(mat, mat2, C, m, n, p);
        	matrix matrix6 = new matrix(mat, mat2, C, m, n, p);
        	matrix matrix7 = new matrix(mat, mat2, C, m, n, p);
        	matrix matrix8 = new matrix(mat, mat2, C, m, n, p);
        	Thread th1 = new Thread(matrix1);
        	Thread th2 = new Thread(matrix2);
        	Thread th3 = new Thread(matrix3);
        	Thread th4 = new Thread(matrix4);
        	Thread th5 = new Thread(matrix5);
        	Thread th6 = new Thread(matrix6);
        	Thread th7 = new Thread(matrix7);
        	Thread th8 = new Thread(matrix8);
            th1.start(); //.003 sec
            //System.out.println("Time to run using 1 thread is .003 sec");
            th2.start(); //.002 sec
            //System.out.println("Time to run using 2 thread is .002 sec");
            th3.start();
            th4.start(); //.001 sec
            //System.out.println("Time to run using 4 threads is .001 sec");
            th5.start();
            th6.start();
            th7.start();
            th8.start();
            
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
            th6.join();
            th7.join();
            th8.join();
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        */
	}
}
