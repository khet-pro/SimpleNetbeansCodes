
package main;
import java.util.Scanner;
import static main.Login.LoginMenu;


public class Medicine {
static Scanner sc=new Scanner(System.in);
public static int b;
public Medicine() {
MedicineShow vv=new MedicineShow();
vv.adddata();
b=vv.a;
int c=show();
show1(c);
}
public void show1(int c){
while(c!=0){
if(c==1){
b=AddMedicine.AddMedicine(b);
MedicineShow.Show(b);
c=show();
}else if(c==2){
System.out.println("Enter id that you want to delete:");
String d=sc.next();
DeleteMed.delete(d, b);
b=b-1;
MedicineShow.Show(b);
c=show();
}else if(c==3){
System.out.println("Enter a Id that you update.:");
String updid=sc.next();
updateMedic.update(updid, b);
MedicineShow.Show(b);
c=show();
}else if(c==4){
MedicineShow.Show(b);
c=show();
}else if(c==5){
int k=Login.choic1();
AdminLogin.set(k);
Login ff=new Login();
} else{
System.out.println(" ");
System.out.println("Invalid input:");
c=show();
show1(c);
} } } public static int show(){
System.out.println("---------------------------");
System.out.println("WELCOME TO MEDICAL STORE");
System.out.println("---------------------------");
System.out.println("press 1 for add Medicine:");
System.out.println("press 2 for delete Medicine:");
System.out.println("press 3 for updatee Medicine:");
System.out.println("press 4 for Show Medicine:");
System.out.println("press 5 for back:");
System.out.println(" "); System.out.println(" ");
System.out.print("Select any option(1-5):");int c=sc.nextInt();
return c; } }
