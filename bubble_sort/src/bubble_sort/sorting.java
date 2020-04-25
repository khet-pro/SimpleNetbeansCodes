package bubble_sort;
import static bubble_sort.Bubble_sort.arr;
import static bubble_sort.Bubble_sort.scan;
public class sorting {
 public void sort(){    
     int temp;
     System.out.println("Size");
     int size = scan.nextInt();
     arr = new int [size];
     for(int i = 0; i<size; i++){
         System.out.println("Enter Element: " + (i+1));
         arr[i] = scan.nextInt();
     }
     for(int i = 0; i< arr.length; i++){
         for(int j = i+1; j<arr.length; j++){
             if(arr[i] > arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
     }
 }
}