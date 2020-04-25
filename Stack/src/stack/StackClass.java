package stack;
public class StackClass {
    int stack[] = new int [5];
    int top = 0;
    public void push(int data){
        if(top == 5){
            System.out.println("Stack is Full");
        }else{
        stack[top] = data;
        top++;
    }
   }
    public int pop(){
        int data = 0;
        if (isEmpty()){
            System.out.println("Stack is Empty");
        }else{
        top--;
        data = stack[top];
        stack[top] = 0;
        }
        return data;
     }
    public int peak(){
        int data;
        data = stack[top-1];
        return data;
    }
    public  int size(){
        return top;
    }
    public boolean isEmpty(){
        return (top <=0);
    }
    public void Show(){
        for (int show : stack){
            System.out.print(show + " | " );
        }
        System.out.println("");
       }
    }
/*
package guman;
import static guman.Guman.size;
import static guman.Guman.stack;
import java.util.Arrays;
import java.util.Scanner;
public class NewClass { 
int top = 0;
public void push(int data){
    if (top == size){
        System.out.println("Stack Overflow");
    }else{
        stack[top] = data;
        top++;
    }
}
public int pop(){
    int data= 0;
    if(top==-1){
        System.out.println("Stack Underflow");
    }else{
        top--;
        data = stack[top];
        stack[top] = 0;
    }
    return data;
}
public void show(){
    System.out.println(Arrays.toString(stack));
    
   }
   
}
*/