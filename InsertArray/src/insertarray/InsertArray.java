package insertarray;
import java.util.Arrays;
public class InsertArray {
public static void main(String[] args) {
    int i;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String arr[] = new String[50];
        System.out.println("Size");
        int size =Integer.parseInt(scan.next());
        for(i=0; i<size; i++){
        System.out.println("Element: "+ (i+1));
        arr[i] = scan.next();
        }
        System.out.println("insert");
        String insert = scan.next();
        System.out.println("pos");
        int pos = scan.nextInt();
        for(i =size; i>pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = insert;
        for(i =0; i<size+1; i++){
        System.out.println("No: "+ arr[i]);
       }
        System.out.println("search");
        String sr = scan.next();
        for(i=0; i<=size+1; i++){
        if(arr[i].equals(sr)){
            System.out.println("found: " + i);
        break;
        }else{
            System.out.println("nooooooo");   
        }
      }
   }
}