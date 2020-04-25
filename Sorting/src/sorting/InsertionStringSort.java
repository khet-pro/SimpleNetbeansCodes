package sorting;
public class InsertionStringSort {
public void InsertionStringSort(){
      String arr[] = {"e","a","i","u","o"};
    String temp;
    for(int i=1; i<arr.length; i++){
        temp = arr[i];
        int j = i;
        while(j>0 && arr[j-1].compareTo(temp)>0){
            arr[j] = arr[j-1];
            j--;  
        }
        arr[j] = temp;
      }
        System.out.print("Insertion String Sort = ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
        System.out.println("");
    }
}    
