package main;
import java.util.Scanner;
import static main.adddata.Array;
import static main.adddata.id;


public class SaleRecord {
static String id1[]=new String[100];
static String Mednme1[]=new String[100];
static String Cmpyname1[]=new String[100];
static String Quantity1[]=new String[100];
static String Ppu1[]=new String[100];
static String total[]=new String[100];
static int a1=0;
static int b1=0;
static String Array1[]=new String[100];
static Scanner sc1=new Scanner(System.in);
public SaleRecord(){
for(int i=0;i<100;i++){
id1[i]=""; Mednme1[i]=""; Cmpyname1[i]=""; Quantity1[i]=""; Ppu1[i]=""; total[i]="";
} }
public static void Showp(int b){
System.out.println(" ");
System.out.println(" Hello "+userLogin.first+" "+userLogin.last);
System.out.println("Your receipt:");
System.out.println(" ");
System.out.println(" ID | Medicine | Compyname | Quantiy |price |Total");
System.out.println(" ");
for(int i=0;i<b;i++){
Array1[i] =" "+id1[i]+"\t"+Mednme1[i]+"\t"+Cmpyname1[i]+"\t"+Quantity1[i]+"\t"+Ppu1[i]+"\t" +total[i]+" ";
String ff=total[i];
int sum=Integer.parseInt(ff);
b1=b1+sum;
System.out.println(Array1[i]);
}
System.out.println(" ");
System.out.println("Total Amount:" +b1);
}
}