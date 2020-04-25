package sorting;
public class BubbleStringSort {
public void StringBubble(){
   String arr[] = {"g","u","m","a","n"};
   String temp;
   for(int i=0; i<arr.length; i++){    
       for(int j=0; j<arr.length-1; j++){
           if(arr[j].compareTo(arr[j+1])>0){
               temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
           }
    }
   }
    System.out.print("Bubble String  Sort = ");
   for(int i=0; i<arr.length; i++){
       System.out.print(arr[i]);
   }
        System.out.println("");
  }
}
