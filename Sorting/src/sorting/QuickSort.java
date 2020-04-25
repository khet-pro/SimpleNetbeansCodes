package sorting;
import java.util.Arrays;
import static sorting.Sorting.arr;
public class QuickSort {
    public int partition(int arr[], int low, int high){
      int pivot = arr[(low + high)/2];
        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;             
                low++;
                high--;
            }
        }
        return low;
    }
    public void quickSortRecursion(int[] arr, int low, int high){
        int pi = partition(arr, low, high);
        if(low< pi-1){
            quickSortRecursion(arr, low, pi-1);
        }else if(pi< high){
            quickSortRecursion(arr, pi, high);
        }
    }
    public void display(int arr[]){
        System.out.println("Quick Sort = " + Arrays.toString(arr));       
        /*
        System.out.print("Quick Sort = |");
        for(int i : arr){
            System.out.print(i + "|");
        }
        System.out.println("");
        */
    }
}   
