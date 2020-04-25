package bst;
class BST{
     private node root;
     public BST(){
         root = null;
     }
     public boolean isEmpty(){
         return root == null;
     }
     public void insert(int data){
         root = insert(root, data);
     }
     private node insert(node node, int data){
         if (node == null)
             node = new node(data);
         else{
             if (data <= node.getData())
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
     }
     public void delete(int k){
         if (isEmpty())
             System.out.println("Tree Empty");
         else if (search(k) == false)
             System.out.println("Sorry "+ k +" is not present");
         else{
             root = delete(root, k);
             System.out.println(k+ " deleted from the tree");
         }
     }
     private node delete(node root, int k){
         node p, p2, n;
         if (root.getData() == k){
             node lt, rt;
             lt = root.getLeft();
             rt = root.getRight();
             if (lt == null && rt == null)
                 return null;
             else if (lt == null){
                 p = rt;
                 return p;
             }
             else if (rt == null){
                 p = lt;
                 return p;
             }else{
                 p2 = rt;
                 p = rt;
                 while (p.getLeft() != null)
                     p = p.getLeft();
                 p.setLeft(lt);
                 return p2;
             }
         }
         if (k < root.getData()){
             n = delete(root.getLeft(), k);
             root.setLeft(n);
         }else{
             n = delete(root.getRight(), k);
             root.setRight(n);             
         }
         return root;
     }
     public int countNodes(){
         return countNodes(root);
     }
     private int countNodes(node r){
         if (r == null)
             return 0;
         else{
             int l = 1;
             l += countNodes(r.getLeft());
             l += countNodes(r.getRight());
             return l;
         }
     }
     public boolean search(int val){
         return search(root, val);
     }
     private boolean search(node r, int val){
         boolean found = false;
         while ((r != null) && !found){
             int rval = r.getData();
             if (val < rval)
                 r = r.getLeft();
             else if (val > rval)
                 r = r.getRight();
             else{
                 found = true;
                 break;
             }
             found = search(r, val);
         }
         return found;
     }
     public void inorder(){
         inorder(root);
     }
     private void inorder(node r){
         if (r != null){
             inorder(r.getLeft());
             System.out.print(r.getData() +" ");
             inorder(r.getRight());
         }
     }
     public void preorder(){
         preorder(root);
     }
     private void preorder(node r){
         if (r != null){
             System.out.print(r.getData() +" ");
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }
     public void postorder(){
         postorder(root);
     }
     private void postorder(node r){
         if (r != null){
             postorder(r.getLeft());             
             postorder(r.getRight());
             System.out.print(r.getData() +" ");
         }
     }     
 }