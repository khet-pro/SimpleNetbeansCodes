package sorting;
public class SelectionStringSort {
public void selectionStringSort(){
    String arr[] = {"e","a","i","u","o"};
    String temp;
    int min;
    for(int i=0; i<arr.length; i++){
        min = i;   
        for(int j= i+1; j<arr.length; j++){
            if (arr[j].compareTo(arr[min])<0){
                min = j;
      }         
     }
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
        System.out.print("Selection String Sort = ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
        System.out.println("");
  }
}
