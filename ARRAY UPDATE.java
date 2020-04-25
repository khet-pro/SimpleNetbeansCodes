package dsa.lab.task.pkg3;
import java.util.Arrays;
import java.util.Scanner;
public class DSALABTask3 {
    public static void main(String[] args) 
    {
     int size,position;
     String element;
     
     Scanner inp = new Scanner(System.in);
     System.out.println("SIZE OF ARRAY :");
     size=inp.nextInt();
     
        System.out.println("ENTER ELEMENTS OF ARRAY");
     
     String[] array = new String[size];
     
     for(int i=0;i<size;i++)
     {
         array[i]=inp.next();
     }
     
    System.out.println("BEFORE UPDATING");
    System.out.println(Arrays.toString(array));
     
    System.out.println("ENTER A NEW ELEMENT :");
    element = inp.next();
    
     System.out.println("AT WHICH POSITION YOU WANT TO UPDATE YOUR ARRAY :");
     position = inp.nextInt();
     
     for (int i=0;i<size;i++)
     {
         if (position == i)
         {
             array[i] = element;
         }
     }
     
        System.out.println(Arrays.toString(array));
}
}