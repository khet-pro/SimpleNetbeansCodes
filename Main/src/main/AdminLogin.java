

package main;
import java.util.Scanner;
import static main.Login.LoginMenu;
import static main.Login.choic1;




public class AdminLogin {
public static String first="admin";
public static String last="admin";
public static String Id="123";
public static String pass="abc";
public static void set(int i) {
Scanner sc=new Scanner(System.in);
if(i==1){
System.out.println(" FIRST NAME:");
String first=sc.nextLine();
System.out.println(" LAST NAME:");
String last=sc.nextLine();
System.out.println("ID: ");
Id=sc.nextLine();
System.out.println("PASSWORD:");
pass=sc.nextLine();
int k=choic1();
AdminLogin.set(k);
Login ff=new Login();
}else if(i==2){
System.out.println("ID: ");
String Id1=sc.nextLine();
System.out.println("PASSWORD:");
String pass1=sc.nextLine();
if(Id.equals(Id1) && pass.equals(pass1)){
Medicine obj=new Medicine();
}else{
System.out.println("incorrect Id and password."+"\n"
+ "Try again");
int k1=choic1();
AdminLogin.set(k1);
Login ff=new Login();
}
}else if(i==3){
Login ff=new Login();
}else{
System.out.println("Invalid input:");
int k=choic1();
System.out.println(" ");
AdminLogin.set(k);
int y=LoginMenu();
}
}
}