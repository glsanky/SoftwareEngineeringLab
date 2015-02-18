import java.io.*;
public class stack {
   private int size;
   private long[] arr;
   private int top;
   public stack(int s) {
      size = s;
      arr = new long[size];
      top = -1;
   }
   public void push(long j) {
      arr[++top] = j;
   }
   public long pop() {
      return arr[top--];
   }
   public boolean isEmpty() {
      return (top == -1);
   }
   public boolean isFull() {
      return (top == size - 1);
   }
   public static void main(String[] args)throws IOException {
      stack s = new stack(10);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter number of elements in stack ");
      int n=Integer.parseInt(br.readLine());
      while(n-->0)
      s.push(Integer.parseInt(br.readLine()));
      while (!s.isEmpty()) {
         long value = s.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      System.out.println("");
   }
}