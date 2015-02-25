package palindrome;

import java.io.*;
public class MultipleExcep
{
	public static void main(String[] args)throws IOException
	{
		int c;
		int a[]=new int[5];
		a[0]=1; a[1]=2; a[2]=3; a[3]=4; a[4]=5;
		System.out.print("Array: ");
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.print("Enter element number to be accessed: ");
			int index=Integer.parseInt(br.readLine())-1;
			System.out.print("Element accessed: "+a[index]+"\nEnter divisor: ");
			int div=Integer.parseInt(br.readLine());
			System.out.println("Result obtained after division: "+a[index]/div);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Error: "+e);
		}
		catch(ArithmeticException e)
		{
			System.err.println("Error: "+e);
		}
		finally 
		{
			System.out.println("Finally");
		}
	}
}