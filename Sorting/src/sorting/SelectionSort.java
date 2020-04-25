package sorting;
public class SelectionSort {
    public void SelectionSort(){
    int arr[] = {5,3,4,1,2};
    int min, temp = 0;
    for(int i=0; i<arr.length; i++){
        min = arr[i];   
        for(int j= i+1; j<arr.length; j++){
            if (arr[j] < arr[min]){
                min = arr[j];
      }  
     }
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }
        System.out.print("Selection Sort = ");
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
        System.out.println("");
  }
}
