package array;
import static array.Array.last;
import static array.Array.names;
import java.util.Scanner;
public class class1{    
      Scanner scan = new Scanner(System.in);
        public void students(){
        System.out.print("Enter number of Students: ");
	int numOfStudents = Integer.parseInt(scan.nextLine());
	names = new String[numOfStudents];
	    for (int i = 0; i < names.length; i++) {
	System.out.print("Enter the name of Student " + (i+1) + " : ");   
	names[i] = scan.nextLine();
        }
            System.out.println("Before adding last student");
	    for (int i = 0; i < names.length; i++) {
	System.out.print("Student " + (i+1) + " : ");
	System.out.print(names[i] + "\n");
     }  
   }
}
