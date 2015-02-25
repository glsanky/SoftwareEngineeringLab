package palindrome;

import java.util.*;
import java.io.*;

public class ConvertArrayList{
	public static void main(String args[]){
		BufferedReader in;
		int n=0;
		try{
			in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("How many elements you want to add to the array: ");
			n = Integer.parseInt(in.readLine());
	   }
	   catch(IOException e){
		   System.out.println("Read error!!");
	   }
	   String[] name = new String[n];
	   for(int i = 0; i < n; i++){
		   try{
			   in=new BufferedReader(new InputStreamReader(System.in));
			   name[i] = in.readLine();
		   }
		   catch(IOException e){
			   System.out.println("Read Error!!");
		   }
	   }
	      
	   List list = Arrays.asList(name); 
	   System.out.println();
	   for(Object li: list)
	   {
	      String str = (String)li;
	      System.out.print(str + " ");
	   }
	}
}
