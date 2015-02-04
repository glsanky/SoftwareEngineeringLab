/* This is a program to demonstrate  multiple inheritance in Java */
/* Date:- 28th January 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/
interface a{// creating an interface
	int trinity(int a,int b);

};

class b extends base implements a{//Multiple inheritance
	public int trinity(int a,int b)
	{
		return a-b;
	}
};
public class matrix{

	
	public static void main(String[] args) {
		b tmp = new b();
		System.out.println(tmp.neo(6,7));//multiple inheritance
		System.out.println(tmp.trinity(3,4));
	/*	try{
			int arr[]=new int[3];
			arr[5]=5;
			int a=10/0;

		}
		catch(ArrayIndexOutOfBoundsException e ) {
			
			System.out.println(e.getMessage());
			System.err.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			System.err.println(e);
		}
		finally{
			System.out.println("In finally block");
		}*/
		subroutine();
	}
	public static void subroutine()
	{
	int d=10/0;
	System.out.println(d);
	}

}

