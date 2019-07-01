package lab5;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Wordcount {

	public static void main(String[] arg)throws IOException
	{
		BufferedReader sc=new BufferedReader(new FileReader("C:\\Users\\srsathi\\Desktop\\Eclipse Workspace\\Flow1\\src\\lab5\\file.txt"));
		String line;
		int Charcount=0;
		int wordcount=0;
		int linecount=0;
		while((line=sc.readLine())!=null)
		{
			linecount++;
			String s[]=line.split("");
			Charcount+=s.length;
			String s1[]=line.split(" ");
			wordcount++;
			System.out.println(linecount+" "+Charcount+" "+wordcount);
			sc.close();
			
			
		}
		{
			
		}
	}
}
