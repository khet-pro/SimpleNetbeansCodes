package mergingarray;
import java.util.Arrays;
public class IntMerging {
    public void print(){
    int[] arr_1 = {1,2,3,4,5};
        int[] arr_2 = {6,7,8,9,10};
        int length = arr_1.length +arr_2.length;
        int[] merge_arr = new int [length];
        int position = 0;
        for(int element:arr_1){
            merge_arr[position] = element;
            position++;
        }
         for(int element:arr_2){
             merge_arr[position] = element;
             position++;
         }   
        System.out.println(Arrays.toString(merge_arr));
    }
 }

