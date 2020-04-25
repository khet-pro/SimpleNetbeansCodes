package main;
import java.util.Scanner;
import static main.Login.LoginMenu;
import static main.Login.choic1;
public class UserSection {
static int p=0;
public UserSection(){
int a=Menu();
while(a!=-5){
if(a==1){
int aa=MedicineShow.a;
MedicineShow.Show(aa);
System.out.println(" ");
System.out.println
("Enter Id of Medicine that you want to buy:");
Scanner sc=new Scanner(System.in);
String id=sc.next();
System.out.println
("Enter how many quantity that you want:");
String Quan=sc.next();
int n=MedicineShow.a;
p=BuyMed.buy(id,n,Quan,p);
UserSection of=new UserSection(); break;
}else if(a==2){
SaleRecord.Showp(p);
UserSection of=new UserSection();
break;
} else if(a==0){
int k1=choic1();
System.out.println(" ");
userLogin.set(k1);
int y =LoginMenu();
} else {
System.out.println("Invalid input");
System.out.println(" ");
UserSection of=new UserSection();
} } }
public static int Menu(){
System.out.println("---------------------------");
System.out.println("WELCOME TO MEDICAL STORE");
System.out.println("---------------------------");
System.out.println("press 1 for See Stock:");
System.out.println("press 2 for Sale Record:");
System.out.println("press 0 for back:");
System.out.println(" ");
System.out.print("Select any option:");
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
return s;
}

}