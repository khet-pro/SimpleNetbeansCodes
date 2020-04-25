package mergingarray;
import java.util.Arrays;
import java.util.Scanner;
public class MergingArray {
public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
      int position = 0;
      System.out.print("Enter size of an array: ");
	int size = Integer.parseInt(scan.nextLine());
	String arr1[] = new String[size];
        String arr2[] = new String[size];
      for (int i=0; i<arr1.length; i++){
      System.out.println("Array1: " + (i+1));
       arr1[i] = scan.next();
    }
      for (int i=0; i<arr2.length; i++){
      System.out.println("Array2: " + (i+1));
      arr2[i] = scan.next();
    }
      int length = arr1.length + arr2.length;
     String [] merge_arr = new String [length];
     System.out.println("Before marging array");
     System.out.println(Arrays.toString(arr1));
     System.out.println(Arrays.toString(arr2));
     System.out.println("After marging array");
      for(String element:arr1){
           merge_arr[position] = element;
            position++;
        }
         for(String element:arr2){
           merge_arr[position] = element;
             position++;
         }   
        System.out.println(Arrays.toString(merge_arr));
    }
}