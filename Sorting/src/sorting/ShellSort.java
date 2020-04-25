package sorting;
public class ShellSort {
private long[] data;
      private int len;
      public void ShellSort(int max){
        data = new long[max];
        len = 0;
      }
      public void insert(long value){
        data[len] = value; 
        len++;
      }
      public void display(){
        System.out.print("Shell Sort = ");
        for (int j = 0; j < len; j++)
          System.out.print(data[j] + " ");
        System.out.println("");
      }
      public void shellSort(){
        int inner, outer;
        long temp;
        //find initial value of h
        int h = 1;
        while (h <= len / 3)
          h = h * 3 + 1; // (1, 4, 13, 40, 121, ...)
        while (h > 0){ // decreasing h, until h=1
          // h-sort the file
          for (outer = h; outer < len; outer++) {
            temp = data[outer];
            inner = outer;
            // one subpass (eg 0, 4, 8)
            while (inner > h - 1 && data[inner - h] >= temp) {
              data[inner] = data[inner - h];
              inner -= h;
            }
            data[inner] = temp;
          }
          h = (h - 1) / 3; // decrease h
        }
      }    
}
