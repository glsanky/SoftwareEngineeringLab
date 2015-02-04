/* This is a program to compare creation time of strings in two different ways */
/* Date:- 28th January 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/
public class stringcompare {

	public static void main(String[] args) {
		
		string1();//first way of creating
		string2();//second way of creating
		}
	public static void string1()
	{
		long start = System.nanoTime();//to take the start time
		String n="Morpheus";
		long end1 = System.nanoTime();//to take the end time
		System.out.println(end1-start);//Time taken by first method of creation
	}
	public static void string2()
	{
		long start = System.nanoTime();//to take the start time
		String n=new String("Morpheus");
		long end1 = System.nanoTime();//to take the end time
		System.out.println(end1-start);//Time taken by second method of creation
	}

}
