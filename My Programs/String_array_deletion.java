package string_array_deletion;
import java.util.Scanner;
public class String_array_deletion {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("SIZE OF ARRAY :");
        int size=input.nextInt();
        
        String arr[];  
       arr = new String[size];
       
       System.out.println("ENTER ELEMENTS ");
        for(int i=0;i<size;i++)
        {
            arr[i] = input.next();
        }
        
        System.out.println("ENTER ELEMENT TO DELETE :");
        String del = input.next();
        for(int i=0;i<arr.length;i++)
        {
           //ternary operator
            if(arr[i] == null ? del == null : arr[i].equals(del))
            {
                for(int j=i; j<arr.length-1;j++)
                {
                    arr[j] = arr[j+1];
                    //arr[j]=0;
                }
        }
        }
         
        System.out.println("AFTER DELETION");
        for (String arr1 : arr) {
            System.out.println(arr1);
        }
    
}
}
