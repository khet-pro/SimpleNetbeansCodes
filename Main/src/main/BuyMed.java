package main;
import java.util.Scanner;


public class BuyMed extends adddata{
SaleRecord ob=new SaleRecord();
public static int buy(String a,int n,String quan,int q){
int vv=Integer.valueOf(quan);
for(int i=0;i<n;i++){
if(a.equals(""+id[i])){
int b=Integer.valueOf(""+Quantity[i]);
if(vv==b){
int id1=q+1;
int price=Integer.parseInt(Ppu[i]);
int sum=price*vv;
SaleRecord.id1[q]=""+id1; SaleRecord.Cmpyname1[q]=Cmpyname[i]; SaleRecord.Mednme1[q]=Mednme[i];
SaleRecord.Quantity1[q]=Quantity[i]; SaleRecord.Ppu1[q]=Ppu[i]; SaleRecord.total[q]=""+sum; q=q+1;
id[i]="";
Mednme[i]="";
Cmpyname[i]="";
Quantity[i]="";
Ppu[i]="";
DeleteMed.change(a,n);
System.out.println("buy Succcefully a Medicine");

}else if(vv<b){
int price1=Integer.parseInt(Ppu[i]);
int re=b-vv;
int sum1=price1*re;
int id1=q+1;
SaleRecord.id1[q]=""+id1;; SaleRecord.Cmpyname1[q]=Cmpyname[i];
SaleRecord.Mednme1[q]=Mednme[i];
SaleRecord.Quantity1[q]=""+vv; SaleRecord.Ppu1[q]=Ppu[i]; SaleRecord.total[q]=""+sum1;
Quantity[i]=""+re;
q=q+1;
System.out.println("buy Succcefully a Medicine");
}
}
}
return q;
} }