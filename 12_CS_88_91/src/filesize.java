/* This is a program to find the size of a file */
/* Date:- 4th February 2015 */
/* Authored by Sankarshan Purkayastha and Arun Pandey */
/* Roll no 12/CS/88 and Roll no 12/CS/91*/

import java.io.*;
public class filesize {

	public static void main(String[] args) {
        
            File file = new File("/home/nitdgp/workspaceRoll88_91/12_CS_88_91/src/java.pdf");//Opening the file
            if(file.exists())//checking if file exists
            System.out.println(file.length());//Printing the length of the file
            
    }
}


