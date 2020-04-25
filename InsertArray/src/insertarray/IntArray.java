package insertarray;
public class IntArray {
  public void display(){
      java.util.Scanner sc = new java.util.Scanner(System.in);   
      //int arr[] = new arr[5];
        System.out.println("Enter size of an array");
        int size = sc.nextInt();
        int [] arr = new int [size+1];
        System.out.println("Enter element in an array");   
        for(int i = 0; i<size ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Element to insert: ");
        int x = sc.nextInt();
        System.out.println("Element position to insert(index number): ");
        int pos = sc.nextInt();       
        for( int i= size ; i > pos ; i--){
        arr[i] = arr[i-1];
        }       
        arr[pos] = x;
        System.out.println("New Array is");
        for ( int i=0 ; i < size ; i++){
            System.out.println(arr[i]);
        }
    }
    
}