package palindrome;

import java.io.*;
interface a
{
	int fun(int a,int b);
};

class test extends Base implements a
{
	@Override
	public int fun(int a, int b) 
	{
			return a-b;
	}
};

public class MultipleInheritance
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers: ");
		int num1=Integer.parseInt(br.readLine());
		int num2=Integer.parseInt(br.readLine());
		test temp=new test();
		System.out.println("Addition from base class: "+temp.add(num1,num2));
		System.out.println("Subtraction(fun) from test class: "+temp.fun(num1,num2));	
	}
}

