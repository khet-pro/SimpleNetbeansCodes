package main;

public class DeleteMed extends adddata {
    
    
    
    String temp;

    
    
    
    
public static void delete(String delId,int n){
    for(int i=0;i<n;i++){
if(delId.equals(""+id[i])){
id[i]=""; Mednme[i]=""; Cmpyname[i]="";
Quantity[i]=""; Ppu[i]="";
}
}
change(delId,n);
}
public static void change(String delId ,int n){
int ff= Integer.parseInt(delId);
for(int g=ff;g<n;g++){
Mednme[g-1]=Mednme[g]; Cmpyname[g-1]=Cmpyname[g]; Quantity[g-1]=Quantity[g];
Ppu[g-1]=Ppu[g];
}
id[n-1]=""; Mednme[n-1]=""; Cmpyname[n-1]=""; Quantity[n-1]=""; Ppu[n-1]="";
for(int cg=0;cg<(n-1);cg++){
int a=cg+1;
id[cg]=""+a;
} 

} 





}