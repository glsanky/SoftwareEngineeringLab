/* This is a program to demonstrate the use of different types of collection classes */
/* Date:- 4th February 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/
//Importing all util packages. We will be using Map,Set,
//SortedMap,SortedSet,TreeMap,TreeSet,ArrayList,Collection,
//HashMap,HashSet,Iterator,LinkedHashMap
//LinkedHashSet,LinkedList,List
import java.util.*;
public class differenttypesofcollections {
   public static void main(String[] args) {
      List lnkLst = new LinkedList();
      lnkLst.add("sanky");
      displayAll(lnkLst);
      List aryLst = new ArrayList();
      aryLst.add("Pandey");
      displayAll(aryLst);
      Set hashSet = new HashSet();
      hashSet.add("spandan");
      displayAll(hashSet);
      SortedSet treeSet = new TreeSet();
      treeSet.add("Souradeep");
      displayAll(treeSet);
      LinkedHashSet lnkHashset = new LinkedHashSet();
      lnkHashset.add("Vamshi");
      displayAll(lnkHashset);
      Map map1 = new HashMap();
      map1.put("Adarsh", "A");
      displayAll(map1.keySet());
      displayAll(map1.values());
      SortedMap map2 = new TreeMap();
      map2.put("Joe", "JJ");
      displayAll(map2.keySet());
      displayAll(map2.values());
      LinkedHashMap map3 = new LinkedHashMap();
      map3.put("bleh", "JJJ");
      displayAll(map3.keySet());
      displayAll(map3.values());
   }
   static void displayAll(Collection col) {
      Iterator itr = col.iterator();
      while (itr.hasNext()) {
         String str = (String) itr.next();
         System.out.print(str + " ");
      }
      System.out.println();
   }
}