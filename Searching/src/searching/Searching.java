package searching;
import java.util.Scanner;
public class Searching {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt(); 
        int []array = new int[n];
        System.out.println("Enter Elements of Array");
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
      //System.out.println(array.length);
       // int x=10, flag=0;
        System.out.println("Enter element to find");
        int x = sc.nextInt(), flag=0;
        for(int i = 0;i<array.length;i++){
            if(array[i]==x){
                flag=1;
                break;
            }
            else{
                flag=0;
               
            }
        }
        if(flag==1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }  
}
