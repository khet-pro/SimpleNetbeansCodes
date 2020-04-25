package traversing;
import java.util.Arrays;
import java.util.Scanner;
import static traversing.Traversing.arr;
public class Traverse {
  public void print(){
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.println("Arrays");
            arr[i] = scan.next();
            String element = arr[i];
        }
     System.out.println(Arrays.toString(arr));
  }
    public String[] insert(String[] orignalArray, String newItem){
        int currentSize = orignalArray.length;       
        int newSize = currentSize+1;
        String[] tempArray = new String[newSize];
        for( int i = 0 ; i<orignalArray.length; i++){
            tempArray[i] = orignalArray[i];
    }
       tempArray[newSize-1] = newItem ;
        return tempArray;
    }
}
 
    