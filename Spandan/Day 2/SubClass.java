package palindrome;
import java.io.*;

class Sub extends Base
{
	int add(int a,int b)
	{
		return a*2+b*2;
	}
}

public class SubClass
{
	public static void main(String args[])throws IOException
	{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers: ");
		int num1=integer.parseInt(br.readLine());
		int num2=integer.parseInt(br.readLine());
		Base b=new Base();
		Sub s=new Sub();
		Base b2=new Sub();
		int res=b.add(num1,num2);
		System.out.println("Base output: "+res);
		res=s.add(num1,num2);
		System.out.println("Sub output: "+res);
		res=b2.add(num1,num2);
		System.out.println("Sub output: "+res);
	}
}