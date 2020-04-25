package updatearray;
import java.util.Arrays;
import java.util.Scanner;
public class UpdateArray {
      public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter size of array: ");
      int size = Integer.parseInt(scan.next());
      String arr[] = new String[size];    
     for (int i= 0; i< arr.length; i++){
      System.out.println("Enter Name: " +(i+1));
      arr[i] = scan.next(); 
     }
    System.out.println("Before Updating Array");
    System.out.println(Arrays.toString(arr));
    System.out.println("Enter Last Name: ");
    String last = scan.next();
    System.out.println("Enter position");
    int pos = scan.nextInt();
    arr[pos] = last;
    
    System.out.println("After Updating Array");
    System.out.println(Arrays.toString(arr));
 }
}
    

