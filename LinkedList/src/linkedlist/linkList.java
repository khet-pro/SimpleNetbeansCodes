package linkedlist;
import static linkedlist.LinkedList.head;
public class linkList {
    node temp;   
    int size = 0;
    public void insertFirst(int val){
   node data = new node(val);
    if (head == null){
        head = data;
        temp = data;
    }else{
        data.next = head;
        head = data;
    }
}
    public void insertLast(int val){
        node data = new node(val);
        if (temp == null){
            head = data;
            temp = data;
        }else{
            while(temp.next != null){
            temp = temp.next;
            }
            temp.next = data;
        }
    }    
    public void insertPos(int val, int pos){
    int size = length(head);
    if (pos == 1){
        insertFirst(val);
    }else if (pos == size){
        insertLast(val);
    }else if(pos >1 && pos <= size){
        node data, temp;
        data =new node(val);
        temp = head;
    for (int i = 1;i <pos-1; i++){
        temp = temp.next;
        }
        data.next = temp.next;
        temp.next = data;
        }else{
        System.out.println("Insertion Invalid at position : " + pos);
       }
    }
    public void deleteFirst(){
        node temp = head;
        head = head.next;
        temp.next = null;
    }    
    public void deleteLast(){
     int size = length(head);
     if (head == null){
         System.out.println("List is already empty");
     }else if (size == 1){
         head  = null;
    }else{
    node temp = head;
         for( int i = 1; i<size-1; i++)
             temp = temp.next;
             temp.next = null;         
    }
}
    public void deletePos(int pos){
    int size = length(head);
    if (head == null){
        System.out.println("List is already empty");
    }else if (pos <1 || pos > size){
        System.out.println("Invalid position");
    }else if(pos == 1){
        deleteFirst();
    }else if(pos == size){
        deleteLast();
    }else{
        node temp, current;
        temp = head;
        for (int i = 1; i<pos-1; i++){
        temp = temp.next;
        }
        current = temp.next;
        temp.next = (current.next);   
      }  
    }
    public void traverse(){
            if(head != null){
                node show = head;
                System.out.println(show);
                while(show.next != null){
                    show = show.next;
                    System.out.println(show);
                }
            }
        }
    public node find(int data){
        if(head == null)
            return null;
        if(head.data == data)
            return head;
        node show = head;
        while(show.next != null){
            show = show.next;
            if(show.data == data)
                return show;
        }
        return null;
    }
    public int length (node head){
        int size = 0;
        node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }
    return size;   
    }
}
   
