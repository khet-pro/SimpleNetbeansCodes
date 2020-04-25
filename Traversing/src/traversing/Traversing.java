package traversing;
import java.util.Scanner;
public class Traversing {
static String arr[] = new String[2];
 public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
    int c = 1;
        Traverse t = new Traverse();
        t.print();
        System.out.println("Enter last element");
        String input = scan.next();
        System.out.println("Element after adding element: ");
       arr = t.insert(arr, input);
        for(String a:arr){
            System.out.println("Element " + (c++) + ": " + a);
        }      
    } 
}  
