package lab8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Fileexists {
	 public static void main(String[] args) throws IOException
	    {
	        Scanner sc=new Scanner(System.in);
	        String string=sc.next();
	        String filetype="undefined";
	        File f=new File(string);
	        if(f.exists())
	        {
	            System.out.println("file exists");
	        
	        if(f.canRead())
	        {
	            System.out.println("File is readable");
	        }
	        if(f.canWrite())
	        {
	            System.out.println("File is writable");
	        }
	        
	        filetype=Files.probeContentType(f.toPath());
	        System.out.println(f.length());
	        System.out.println(filetype);
	        }
	else
	    {
	        System.out.println("File not found");
	    }

	 

	}
	}
	 


