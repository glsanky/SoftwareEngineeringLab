package palindrome;

import java.io.*;
public class Finally
{
	public static void main(String[]args)throws IOException
	{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter divisor: ");
        int div=Integer.parseInt(br.readLine());
		int a,c;
		try
		{
			a=5;
			c=a/div;
            System.out.println("Result obtained :"+c);
            System.out.println("End of try block reached.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		finally 
		{
			System.out.println("Completed");
		}
	}
}
