import RNG.*;
import java.util.*;

class BinSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input size:");
        int n = sc.nextInt();

        int[] A = new int[n];
        System.out.print("Enter a Sorted List:");
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        long bestCase = binSearch(A, A[n/2]);
        long worstCase = binSearch(A, A[(n/2)-1]);

        long averageCase = 0L;
        RandomGenerator rg = new RandomGenerator(n);
        int[] arr = new int[n];
        arr = rg.readArr(n);
        for(int i = 0 ; i< n; i++){
            averageCase += (binSearch(A, arr[i])/n);
        }

        System.out.println("BEST CASE\nProblem Instance:\t");
        for(int i = 0; i<n; i++)    System.out.print(A[i]+" ");
        System.out.println("\nExecution Time:\t"+bestCase);
        System.out.println("\nOutput:\tFound");

        System.out.println("WORST CASE\nProblem Instance:\t");
        for(int i = 0; i<n; i++)    System.out.print(A[i]+" ");
        System.out.println("\nExecution Time:\t"+worstCase);
        System.out.println("\nOutput:\tFound");

        System.out.println("AVERAGE CASE\nProblem Instance:\t");
        for(int i = 0; i<n; i++)    System.out.print(A[i]+" ");
        System.out.println("\nExecution Time:\t"+averageCase);
        System.out.println("\nOutput:\tFound");

    }

    public static long binSearch(int[] arr, int key){
        int a = 0, b = arr.length;
        long start = System.nanoTime();
        while(a!=b){
            int mid = (a+b)/2;
            if (arr[mid] == key){
                break;
            }
            else if (key > arr[mid]){
                a = mid+1;
            }else{
                b = mid-1;
            }
        }
        long stop = System.nanoTime();
        return stop-start;
    }
}