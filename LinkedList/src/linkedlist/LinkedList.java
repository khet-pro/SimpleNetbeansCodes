package linkedlist;
import java.util.Scanner;
public class LinkedList {
static node head;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
       linkList list = new linkList();
       int pos, val;
       list.insertFirst(17);
       list.insertFirst(10);
       list.insertFirst(15);
       list.insertFirst(20);
       System.out.println("Before");
       list.traverse();
       System.out.println("Enter Element");
       val = scan.nextInt();
       System.out.println("Enter position");
       pos = scan.nextInt();
       list.insertPos(val,pos);
       //list.insertLast(50);
       list.deleteFirst();
       //System.out.println("Enter position");
       //pos = scan.nextInt();
       //list.deletePos(pos);
       //list.deleteLast();
       System.out.println("After");
       list.traverse();
       //System.out.println("Length = " + list.length(head));
       //System.out.println("5 exists? " + list.find(5));
       //System.out.println("15 exists? " + list.find(15));
    } 
}
