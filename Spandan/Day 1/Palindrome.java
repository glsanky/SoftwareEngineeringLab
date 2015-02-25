package palindrome;

import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome p=new Palindrome();
		Scanner in=new Scanner(System.in);
		ArrayList list=new ArrayList();
		System.out.print("Enter number of elements to be entered: ");
		int num=in.nextInt();
		int i=0;
		while(i++<num)
			list.add(Integer.toString(in.nextInt()));
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			if(p.isPalindrome(itr.next()))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
	public boolean isPalindrome(Object num)
	{
		int copy=Integer.parseInt((String)num);
		int d=0;
		while(copy!=0)
		{
			d=(d*10)+(copy%10);
			copy/=10;
		}
		return d==Integer.parseInt((String)num);
	}

}
