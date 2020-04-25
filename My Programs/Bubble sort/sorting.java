package pkg1812324_bubblesort;
public class sorting 
{
    public static int[] sorted(int[] a)
        {
            int temp;
            for(int i=0; i<a.length;i++)
            {
                for( int j=i+1; j<a.length;j++)
                {
                    if(a[i] >a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
    }
}
}    
        return a;
}
}
    

