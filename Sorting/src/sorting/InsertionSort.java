package sorting;
import java.util.Scanner;
public class InsertionSort {
 Scanner scan = new Scanner(System.in);
    public void InsertionSort(){
    int arr[] = {5,2,1,4,3};
    int temp;
    for(int i=1; i<arr.length; i++){
        temp = arr[i];
        int j = i;
        while(j>0 && arr[j-1] > temp){
            arr[j] = arr[j-1];
            j--;  
        }
        arr[j] = temp;
      }
        System.out.print("Insertion Sort = ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
        System.out.println("");
    }
}

/*
 public void InsertionSort(){
        System.out.println("Enter size");
        int size = scan.nextInt();
        int arr[] = new int [size];
        int temp;
        System.out.println("Enter elements");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
    for(int i=1; i<arr.length; i++){
        temp = arr[i];
        int j = i;
        while(j>0 && arr[j-1] > temp){
            arr[j] = arr[j-1];
            j--;  
        }
        arr[j] = temp;
      }
    for(int i=0; i<size; i++){
        System.out.print(arr[i]);
    }
        System.out.println("");
    }
}

*/