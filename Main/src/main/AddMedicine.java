
package main;
public class AddMedicine extends adddata {
public static int AddMedicine(int n){
int r=n+1;
System.out.println("Enter a Medicine name:");
String Med=sc.next();
System.out.println("Enter a Company name:");
String Cpyname=sc.next();
System.out.println("Enter a Quantity:");
String Quant=sc.next();
System.out.println("Enter a Price Per Unit:");
String ppu=sc.next();
id[n]=""+r; Mednme[n]=""+Med; Cmpyname[n]
=""+Cpyname;
Quantity[n]=""+Quant;
Ppu[n]=""+ppu; n=n+1;
return n;
}
}
