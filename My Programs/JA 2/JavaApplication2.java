
package javaapplication2;
public class JavaApplication2 {
    public static void main(String[] args) 
    {
        String[] array={"orange","banana","apple"};
        triversing obj=new triversing();
        obj.triverse();
        
        System.out.println("ELEMENTS AFTER ADDING ELEMENT ");
        array=obj.insert(array, "mango");
        for(String element:array)
        {
            System.out.println(element);
        
    }
    
}
}
