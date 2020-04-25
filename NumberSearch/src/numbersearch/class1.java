package numbersearch;
import java.util.Scanner;
public class class1 extends NumberSearch {
      Scanner sc = new Scanner(System.in);
      public void print(){
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt(); 
        int []array = new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<array.length;i++){
        array[i] = sc.nextInt();
        }
        System.out.println("Enter the name of last Student: ");
        last = sc.nextInt();
          for (int i = 0; i< array.length; i++) {
        System.out.print("Numbers " + (i+1) + " : ");
	System.out.print(array[i] + "\n");
      
   }
 }
}