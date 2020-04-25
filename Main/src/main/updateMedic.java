package main;




public class updateMedic extends adddata{
    
public static void update(String a,int n){
System.out.println("Enter a new quantity:");
String sv=sc.next();
System.out.println("Enter a new PPu:");
String gg=sc.next();
for(int i=0;i<n;i++){
if(a.equals(""+id[i])){
Quantity[i]=sv; Ppu[i]=gg;
}
}
}
}