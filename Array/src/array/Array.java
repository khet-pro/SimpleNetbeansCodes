package array;
 import java.util.Scanner;
  public class Array {
      static String last;
      static String names[];
   public static void main(String[] args) {
       int d = 1;
    Scanner scan = new Scanner(System.in);
        class1 c = new class1();
        c.students();
            System.out.println("Enter the name of last student: ");
            last = scan.next();
            names = insert(names, last);
            System.out.println("After adding last student");
        for(String print: names ){
            System.out.println("Student " + (d++) + ": " + print);
     }
    }  public static String[] insert(String[] orignalArray, String newItem){      
        int currentSize = orignalArray.length;
        int newSize = currentSize+1;
        String[] tempArray = new String[newSize];
        for( int i = 0 ; i<orignalArray.length; i++){
            tempArray[i] = orignalArray[i];
    }
        tempArray[newSize-1] = newItem ;
        return tempArray;
    }    
    }
     

