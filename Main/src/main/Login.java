

package main;
import java.util.Scanner;

public class Login {

       public static void main(String[] args) {
             Login ff=new Login();
              }
    public Login() {
int y=LoginMenu();
while(y!=0){
if(y==1){
int k=choic1();
System.out.println(" ");
AdminLogin.set(k);
y=LoginMenu();
}else if(y==2){
int k1=choic1();
System.out.println(" ");
userLogin.set(k1);
y=LoginMenu();
}else if(y==3){
System.exit(0);
}else{
System.out.println("Invalid input");
Login obj=new Login();
}
} }
public static int choic1(){
Scanner sc=new Scanner(System.in);
System.out.println("PRESS 1 FOR SIGH UP");
System.out.println("PRESS 2 FOR SIGN IN");
System.out.println("PRESS 3 FOR BACK ");
System.out.println(" ");
System.out.print("Select any option(1-3):");
return sc.nextInt();
}
public static int LoginMenu(){
System.out.println("---------------------------");
System.out.println("WELCOME TO MEDICAL STORE");
System.out.println("---------------------------");
System.out.println("PRESS 1 FOR ADMIN LOGIN");
System.out.println("PRESS 2 FOR USER LOGIN");
System.out.println("PRESS 3 FOR EXIT");
System.out.println(" ");
System.out.print("Select any option(1-3):");
Scanner sc=new Scanner(System.in);
return sc.nextInt();
}
}
    
    

