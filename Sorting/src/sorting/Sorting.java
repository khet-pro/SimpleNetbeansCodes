package sorting;
import java.util.Arrays;
public class Sorting{
     static int[] arr = {15,9,7,13,12,16,4,18,11};
     static int length = arr.length; //quick sort
     public static void main(String[] args) {
     BubbleSort bubble = new BubbleSort();
     BubbleStringSort strBubble = new BubbleStringSort();
     SelectionSort select = new SelectionSort();
     SelectionStringSort strSelect = new SelectionStringSort();
     InsertionSort insert = new InsertionSort();
     InsertionStringSort strInsert = new InsertionStringSort();
     MergeSort ms = new MergeSort();
     QuickSort qs = new QuickSort();
     ShellSort shell = new ShellSort();
     bubble.BubbleSort();
     strBubble.StringBubble();
     select.SelectionSort();
     strSelect.selectionStringSort();
     insert.InsertionSort();    
     strInsert.InsertionStringSort();
     
    int[] inputArr = {3,5,6,2,4,1};
    ms.sort(inputArr);
    System.out.println("Merge Sort = " + Arrays.toString(inputArr));
    
    qs.quickSortRecursion(arr, 0, length-1);
    qs.display(arr);
    
    int maxSize = 10;
    shell.ShellSort(maxSize);
        for (int j = 0; j < maxSize; j++) {
          long n = (int) (java.lang.Math.random() * 99);
          shell.insert(n);
        }
    shell.display();
    shell.shellSort();
    shell.display();
    }   
}
