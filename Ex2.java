package lab13;

	import java.util.*;
	import java.util.Scanner;

	interface lambda{
		public String print(String s);
	}

	public class Ex2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String str= sc.next();
	        lambda l =(s)-> {
	        	StringBuilder br= new StringBuilder();
	            for(int i = 0 ; i < str.length(); i++)
	            {
	              br = br.append(str.charAt(i)).append(" ");
		        }

	            return br.toString();
	        };
	        String r=l.print(str);
	        System.out.println("Enter the name " +r);
	    }
	}
