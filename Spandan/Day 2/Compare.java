package palindrome;

public class Compare
{
	public static void main(String[] args)
	{
		int i,j;
		long s1,s2,s3,s4;
		s1=System.currentTimeMillis();
		for(i=1;i<=900000000;i++)
		{		
			String s="Madagascar";
		}
		s2=System.currentTimeMillis()-s1;
		s3=System.currentTimeMillis();
		for(i=1;i<=900000000;i++)
		{
			String a=new String("Madagascar");
		}
		s4=System.currentTimeMillis()-s3;
		System.out.println("Performance of 1 = "+s2);
		System.out.println("Performance of 2 = "+s4);
	}
}
