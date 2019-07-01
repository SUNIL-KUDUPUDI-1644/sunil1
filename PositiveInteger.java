package lab8;

import java.util.Scanner;

public class PositiveInteger {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		char[] ch=s.toCharArray();
		int c=0;
		for(int i=0;i<(s.length()-1);i++)
		{
			if(ch[i]<ch[i+1])
			c++;
		}
			if(c==(s.length()-1))
			{
				System.out.println("postive integer");	
				}
			else 
			{
				System.out.println("not a postive integer");
				sc.close();
			}
	}
}
		
		
	
