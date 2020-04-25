package updatearray;
import java.util.Arrays;
public class UpdateInt {
public void display(){
    String[] arr_a={"A","E","J","O","U"};
        System.out.println("Before Array Updating Element");
        System.out.println(Arrays.toString(arr_a));
        System.out.println("After updating Array Element");
        arr_a[2] = "I";
        System.out.println(Arrays.toString(arr_a));
    }   
}
