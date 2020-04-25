package bst;
public class node {
 node left, right;
    int data;
    public node(){
         left = null;
         right = null;
         data = 0;
     }
    public node(int n){
         left = null;
         right = null;
         data = n;
     }
    public void setLeft(node n){
         left = n;
     }
    public void setRight(node n){
         right = n;
     }
    public node getLeft(){
         return left;
     }
    public node getRight(){
         return right;
     }
     public void setData(int d){
         data = d;
     }
     public int getData(){
         return data;
     }     
 }
