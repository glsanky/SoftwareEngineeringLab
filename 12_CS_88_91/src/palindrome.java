/* This is a program to check if a string is a palindrome*/
/* Date:- 28th January 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/
import java.util.*;
import java.io.*;
public class palindrome {

	public static void main(String[] args)throws IOException {
		System.out.println("enter no of strings");
		
		Scanner keyboard = new Scanner(System.in);//To take keyboard input
		String myint;
		int n =keyboard.nextInt();
		ArrayList<String> stuff = new ArrayList<String>();//To take strings in an ArrayList
		System.out.println("enter strings");
		for(int i=0;i<=n;i++)
			{
			 myint = keyboard.nextLine();
			 //System.out.println(myint);
			stuff.add(myint);
			}
		
		Iterator iti=stuff.iterator();// Iterate through the list
		//System.out.println(stuff);
		String b=(String)iti.next();
	while(iti.hasNext())
	{
		if(isPalindrome((String)iti.next()))//Check whether it is a palindrome
				System.out.println("Yes");
		else
			System.out.println("no");
	}
	}
public static boolean isPalindrome(String pal) {//Function checks whether string is a palindrome or not  
	       
String pal1=""; int i=pal.length()-1;
while(i>=0)// Checks palindrome
	pal1+=pal.charAt(i--);
if(pal1.compareTo(pal)==0)
return true;
return false;
}
}
	