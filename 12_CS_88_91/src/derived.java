/* This is a program to demonstrate the use of inheritance */
/* Date:- 28th January 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/
class derivedclass extends base {// creating a derivedclass
	int neo(int a,int b)//method overriding
	{
		return a*b;
	}

};

public class derived{
	public static void main(String args[])
	{
		derivedclass abc= new derivedclass();//Inheritance
		base abcd = new base();//Inheritance
		base ab = new derivedclass();
		System.out.println(abc.neo(4,5));
		System.out.println(abcd.neo(4,5));
		System.out.println(ab.neo(4,5));
	}
}