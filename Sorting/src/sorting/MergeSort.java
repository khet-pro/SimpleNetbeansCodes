package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class MergeSort {
    int[] arr;
    int[] tempMergeArr;
    int length;
    public void sort(int inputArr[]){
        this.arr = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArr(0,length-1);
    }
    public void divideArr(int low, int high){
     if(low < high){
         int middle =  low+(high-low)/2;
         divideArr(low, middle); //It will sort the left side of array
         divideArr(middle+1, high); //It will sort the right side of array.
         mergeArr (low, middle, high);
     }   
    }
    public void mergeArr(int low, int middle, int high){
        for(int i= low; i<= high; i++){
            tempMergeArr[i] = arr[i];
        }
        int i = low;
        int j = middle+1;
        int k = low;
        while(i<=middle && j<= high){
            if(tempMergeArr[i] < tempMergeArr[j]){
                arr[k] = tempMergeArr[i];
                i++;
            }else{
                arr[k] = tempMergeArr[j];
                j++;
            }
            k++;
    }
        while(i<= middle){
            arr[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}   
