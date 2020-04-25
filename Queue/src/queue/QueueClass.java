package queue;
import java.util.Scanner;
public class QueueClass {
    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data){
    if(isFull()){
            System.out.println("Queue is Full");
   }else{
        queue[rear] = data;
        rear++; //or rear = rear + 1;
        size++; 
     }
    }
    public int deQueue(){
        int data = queue[front];
        if (!isEmpty()){
          front++; //front = front+1;
          size--;
    }else{
          System.out.println("Queue is Empty");
        } 
          return data;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public boolean isFull(){
        return getSize() == 5;
    }
    public void show(){
        System.out.print("Elements: ");
         for(int i = 0; i<size; i++) {
             System.out.print( queue[front+i] + " | ");
         }
         System.out.println("");
         System.out.print("Original Queue: ");//cant put in loop,it will print message with each number
         for(int display : queue){ 
             System.out.print(display +" | ");
         }
         System.out.println("");//for nextline
    }
}
    /*
int front, rear, size;
int queue[];
public void qu(int size){
    queue = new int[size];
}
public void enqueue(int data){
    if (rear == 5){
        System.out.println("full");
    }else{
        queue[rear] = data;
        rear++;
    }
}
public void show(){
    System.out.println(Arrays.toString(queue));
    }
}
*/
    
    /*
    int queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data){
        queue[rear] = data;
        rear = (rear + 1)%5; //rear++;
        size++; 
    }
    public int deQueue(){
        int data = queue[front];
        front = (front+1)%5; //front++;   we have used %5 bcoz mode of 5 %5=0, the main reason is to increase the size ,
       since the array was of 5 so we could only enter 5 elements but now we can add infinite elements.
        size--;
        return data;
    }
    public void show(){
        System.out.print("Elements: ");
         for(int i = 0; i<size; i++) {
             System.out.print( queue[(front+i)%5] + " | ");
         }
         System.out.println("");
         System.out.print("Original Queue: ");//cant put in loop,it will print message with each number
         for(int display : queue){ 
             System.out.print(display +" | ");
         }
         System.out.println("");//for nextline
    }
}
  */



//With User Input

/*public class Test {
    static int data;
    static int queue[] = new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data){
        queue[rear] = data;
        rear++; //or rear = rear + 1;
        size++; 
     }
        public void show(){
        System.out.print("Elements: ");
         for(int i = 0; i<queue.length; i++) {
             System.out.print( queue[i] + " | ");
         }
        }
 public static void main(String args[]) { 
     Scanner scan = new Scanner(System.in);
     Test t = new Test();
     System.out.println("Enter data");
     for(int i =0; i<5; i++){
      queue[i] = scan.nextInt();
     }
     t.enQueue(data);
     t.show();
 }
}*/