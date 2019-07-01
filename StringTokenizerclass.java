package lab8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerclass {
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer h=new StringTokenizer (s);
		int sum=0;
		while(h.hasMoreTokens())
			
		{
			String s1=h.nextToken();
			sum=sum+Integer.parseInt(s1);
			
		}
		System.out.println(sum);
		
		
	}

}
