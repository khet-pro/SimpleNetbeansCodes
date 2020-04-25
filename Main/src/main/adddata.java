package main;
import java.util.Scanner;


public class adddata {
static String id[]=new String[100];
static String Mednme[]=new String[100];
static String Cmpyname[]=new String[100];
static String Quantity[]=new String[100];
static String Ppu[]=new String[100];
static int a=0;
static String Array[]=new String[100];
static Scanner sc=new Scanner(System.in);
public void adddata(){
for(int i=0;i<100;i++){
id[i]=""; Mednme[i]=""; Cmpyname[i]=""; Quantity[i]=""; Ppu[i]="";
}
int n=0;
id[n]="1"; Mednme[n]="burfon"; Cmpyname[n]="Ferozsons "; Quantity[n]="5"; Ppu[n]="25"; n=n+1;
id[n]="2"; Mednme[n]="Pandol"; Cmpyname[n]="John & john"; Quantity[n]="2"; Ppu[n]="22"; n=n+1;
id[n]="3"; Mednme[n]="Arinac";Cmpyname[n]="General "; Quantity[n]="7"; Ppu[n]="29"; n=n+1;
id[n]="4"; Mednme[n]="rizek"; Cmpyname[n]="Getz Pharma "; Quantity[n]="17"; Ppu[n]="129"; n=n+1;
a=n;
}
}
