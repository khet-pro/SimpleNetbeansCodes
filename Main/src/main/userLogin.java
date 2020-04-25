package main;
import java.util.Scanner;
import static main.Login.LoginMenu;
import static main.Login.choic1;
public class userLogin {
public static String first="ritick";
public static String last="kumar";
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
userLogin.set(k);
Login.choic1();
}else if(i==2){
System.out.println("ID: ");
String Id1=sc.nextLine();
System.out.println("PASSWORD");
String pass1=sc.nextLine();
if(Id.equals(Id1) && pass.equals(pass1)){
UserSection obj=new UserSection ();
}else{
System.out.println("Incorrect Id and password."+"\n"
+ "Try again");
int k1=choic1();
userLogin.set(k1);
Login ff1=new Login();
}
}else if(i==3){
Login ff=new Login();
}else{
System.out.println("Invalid input:");
int k1=choic1();
System.out.println(" ");
userLogin.set(k1);
int y=LoginMenu(); }

}
}
