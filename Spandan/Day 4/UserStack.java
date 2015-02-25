package palindrome;

public class UserStack {
	   private int maxSize;
	   private long[] stackArray;
	   private int top;
	   public UserStack(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
	      UserStack theStack = new UserStack(10);
	      System.out.println("Pushed 10");
	      theStack.push(10);
	      System.out.println("Pushed 20");
	      theStack.push(20);
	      System.out.println("Pushed 30");
	      theStack.push(30);
	      System.out.println("Pushed 40");
	      theStack.push(40);
	      System.out.println("Pushed 50");
	      theStack.push(50);
	      System.out.print("Popping: ");
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
	}
