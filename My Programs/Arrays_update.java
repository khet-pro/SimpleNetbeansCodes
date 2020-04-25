package arrays_update;
import java.util.Arrays;
public class Arrays_update {
    public static void main(String[] args) 
    {
     String[] arr={"a","s","k"};
        System.out.println("before updating ");
        System.out.println(Arrays.toString(arr));
        arr[2] = "m";
        System.out.println("array after updating");
        System.out.println(Arrays.toString(arr));
    }
    
}
