/* This is a program to convert an array into ArrayList */
/* Date:- 4th February 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/
import java.util.*;
import java.io.*;
//Following example 
//demonstrates to convert an array into a 
//collection Arrays.asList(name) method of Java Util class.
public class arrayintocollection{
   public static void main(String args[]) {
      BufferedReader in;//To take keyboard input
      int size=0;
      try{
    	  in =new BufferedReader
    		      (new InputStreamReader(System.in));//Taking keyboard input
      
      System.out.println("How many elements you want to add to the array: ");
      size = Integer.parseInt(in.readLine());
      }
      catch (IOException e){
      }
      String[] name = new String[size];
      for(int counter = 0; counter < size; counter++){//Inputing values
    	  try{
    		  in =new BufferedReader
        		      (new InputStreamReader(System.in));
         name[counter] = in.readLine();
      }
    	  catch(IOException e){
    		  
    	  }}
    	  
      List list = Arrays.asList(name); //Converting the array to ArrayList
      System.out.println();
      for(Object li: list){//Iterating the list
         String str = (String)li;
         System.out.print(str + " ");//Printing the list
      }
   }
}