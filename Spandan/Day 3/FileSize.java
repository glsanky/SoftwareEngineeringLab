package palindrome;

import java.io.*;

public class FileSize{
	public static void main(String args[]){
		File file = new File("/home/nitdgp/workspace/12CS81/sre/palindrome/src/palindrome/test.txt");
		boolean fileExists = file.exists();
		if (fileExists)
			System.out.println(file.length()+" bytes");
	}
}
