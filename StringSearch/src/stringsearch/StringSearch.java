package stringsearch;
import java.util.Scanner;
 public class StringSearch {
  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
                String search;
		//Decide the number of students
		System.out.print("Enter number of Students:\n");
		int numOfStudents = Integer.parseInt(scan.nextLine());
		//Create a string array to store the names of your students
		String arrayOfNames[] = new String[numOfStudents];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter the name of Student " + (i+1) + " :");
		        arrayOfNames[i] = scan.nextLine();
		}
		//Now show your friend's name one by one
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Student " + (i+1) + " : ");
		        System.out.print(arrayOfNames[i] + "\n");
		}
                 
            	System.out.println("Enter Name of Student:\n");
                search = scan.next();
                 boolean found = false;
                   for (String element:arrayOfNames) {
                 if ( element.equals( search )) {
                found = true;
                  }
                 }
                 if (found) {
                   System.out.println( "Element is found: " + search );
                } else {
                 System.out.println("The array does not contains the string: " + search );
                }
              }  
            }