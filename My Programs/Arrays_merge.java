package arrays_merge;
import java.util.Arrays;
public class Arrays_merge {
    public static void main(String[] args)
    {
        int[] ar_1 = {1,2,3,4,5};
        int[] ar_2={6,7,8,9,10};
        int lenght = ar_1.length + ar_2.length;
        int[] merge_arr= new int [lenght];
        int position = 0;
        for(int element:ar_1)
        {
            merge_arr[position]= element;
            position++;   
        }
        for(int element:ar_2)
        {
            merge_arr[position]= element;
            position++;   
        }
        System.out.println(Arrays.toString(merge_arr));
    }

}