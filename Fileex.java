package lab8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class Fileex {
	public static void main(String[] arg)throws IOException
	{
		BufferedReader h=new BufferedReader(new FileReader("C:\\Users\\srsathi\\Desktop\\Eclipse Workspace\\lab8\\src\\lab8\\file.txt"));
		int c=1;
		String s=h.readLine();
		while(s!=null)
		{
			System.out.println(c+"."+s);
			s=h.readLine();
			c++;
			
			
		}
		h.close();
	}

}
