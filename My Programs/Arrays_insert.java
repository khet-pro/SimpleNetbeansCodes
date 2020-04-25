package arrays_insert;
public class Arrays_insert {
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in); //mporting library n making object of scanner
        System.out.println("size of array :");
        int n= sc.nextInt();
        int[] arr_name; // inceasing size of array
        arr_name = new int[n+1];
        System.out.println("enter elements in an array");
        for(int i=0;i<n;i++)
        {
            arr_name[i]=sc.nextInt();
            
         } 
        System.out.println("enter element to insert :");
        int x=sc.nextInt();
        System.out.println("enter position to insert (index number) ");
        int pos =sc.nextInt();
        for(int i=n;i>pos;i--)
        {
            arr_name[i]= arr_name[i-1];
            
        }
        arr_name[pos]=x;
        System.out.println("new array is ");
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr_name[i]);
           }
}
}