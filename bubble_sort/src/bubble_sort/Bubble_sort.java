package bubble_sort;
import java.util.Arrays;
import java.util.Scanner;
public class Bubble_sort {
    static Scanner scan = new Scanner(System.in);
    static int arr[];
    public static void main(String[] args) {
      sorting s = new sorting();
      s.sort();
      System.out.println("Array = " + Arrays.toString(arr));
    }
}
