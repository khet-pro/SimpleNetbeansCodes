
package javaapplication2;
public class triversing 
{
    public void triverse()
    {
    String[] array={"orange","banana","apple"};
    String element;
    System.out.println("ARRAY");
    for(int i=0;i<=2;i++)
    {
      element=array[i];
      System.out.println(element);
    }
    }
    public String[] insert(String[] originalarray ,String newitem )
    {
        int currentsize=originalarray.length;
        int newsize=currentsize+1;
        String[] temparray= new String[newsize];
        for (int i=0;i<originalarray.length;i++)
    {
      temparray[i]=originalarray[i];
      
    }
        temparray[newsize-1]=newitem;
        return temparray;
    }
}
