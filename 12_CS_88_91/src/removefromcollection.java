/* This is a program to demonstrate the use of different types of collection classes */
/* Date:- 4th February 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/
//Importing all util packages.
import java.util.*;
public class removefromcollection {
   public static void main(String [] args) {   
      int size;
      HashSet collection = new HashSet ();// Here we use a HashSet to remove
      String str1 = "1", str2 = "2", str3 = 
      "3", str4 = "4";  
      Iterator iterator;//Iterator is used to iterate the HashSet
      collection.add(str1);    
      collection.add(str2);   
      collection.add(str3);   
      collection.add(str4);
      System.out.print("Collection data: ");  //Printing the collection data
      iterator = collection.iterator();     
      while (iterator.hasNext()){
         System.out.print(iterator.next() + " ");  
      }
      System.out.println();
      collection.remove(str2);// Removing data from HashSet 
      System.out.println("After removing [" + str2 + "]\n");
      System.out.print("Now collection data: ");
      iterator = collection.iterator();//Iterator is used to iterate the HashSet     
      while (iterator.hasNext()){
         System.out.print(iterator.next() + " ");//Printing the collection data after removal  
      }
      System.out.println();
      size = collection.size();
      System.out.println("Collection size: " + size + "\n");
   }
}