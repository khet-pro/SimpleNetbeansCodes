package linkedlist;
public class node {
int data;
node next;
public node(int data){
    this.data = data;
}
@Override
public String toString(){
    return ("Element = " + data);
}
}
