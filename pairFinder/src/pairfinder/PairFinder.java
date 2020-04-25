package pairfinder;
import java.util.Scanner;
public class PairFinder {
   public static void findPair(int[] A, int sum){
    for (int i = 0; i < A.length-1; i++){
	for (int j = i + 1; j < A.length; j++){
	    if (A[i] + A[j] == sum){
		System.out.println("Pair found at index ["+ i + "," + j+"]");	
            }
            for (int k = j + 1; k < A.length; k++){
             if (A[j] + A[k] == sum){
		System.out.println("Pair found at index ["+ j + "," + k+"]");
		return;
            }
          }
        }   
    }
    System.out.println("Pair not found");
    }
    public static void main(String[] args){ 
    Scanner scan = new Scanner (System.in);
    int A[] = {2,4,9,1,5};
    System.out.print("Enter number: ");
    int sum = scan.nextInt();
    findPair(A, sum);
    }
}