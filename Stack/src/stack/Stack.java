package stack;
import java.util.Scanner;
public class Stack {
public static void main(String args[]) { 
     StackClass s = new StackClass();
     //for priting push method
         s.push(10);
         s.push(12);
         s.push(15);
         s.push(20);
         //for priting peak method
         System.out.println(s.peak());
         s.push(25);
         //for printing pop method
         System.out.println(s.pop());
         //For checking size
         System.out.println("Size = " + s.size());
         //Checking if stack is not empty
         System.out.println(s.isEmpty());
         s.Show();
    }
}
/*
public class Guman{ 
    static int stack[];
    static int size;
    public static void stak(int size){
    stack = new int[size];
}
   static Scanner scan = new Scanner(System.in);
   public static void main(String[] args){
       NewClass n = new NewClass();
       System.out.println("size");
       size = scan.nextInt();
       stak(size);
       System.out.println("Elements");
       for(int i=0; i<size; i++){
           stack[i] = scan.nextInt();
       n.push(stack[i]);
       }
       n.show(); 
   }
}
*/
         
         
     /*
        // Creating an empty Stack 
        Stack<String> STACK = new Stack<String>(); 
        //Stack<Integer> STACK = new Stack<Integer>();  for INT program
        // Use push() to add elements into the Stack 
        STACK.push("Welcome"); 
        STACK.push("To"); 
        STACK.push("Geeks"); 
        STACK.push("For"); 
        STACK.push("Geeks"); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + STACK); 
  
        // Pushing elements into the stack 
        STACK.push("Hello"); 
        STACK.push("World"); 

        // Displaying the final Stack 
        System.out.println("Final Stack: " + STACK); 
    } 
} 
*/