package array_deletion;
import java.util.Scanner;
public class Array_deletion {
    public static void main(String[] args) 
    {
        int[] arr ={10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ELEMENT TO DELETE :");
        int del = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == del)
            {
                for(int j=i; j<arr.length-1;j++)
                {
                    arr[j] = arr[j+1];
                    //arr[j]=0;
                }
        }
    
}
        System.out.println("after deletion");
        for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
}