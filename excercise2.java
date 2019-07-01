import java.util.HashMap;
import java.util.Scanner;

class HelperClass{
	public HashMap countCharacter(char[] ar)
	{
		{
			HashMap<Character,Integer> charCountMap =new HashMap<Character, Integer>();
			for(char c:ar)
			{
				if(charCountMap.containsKey(c))
				{
					charCountMap.put(c, charCountMap.get(c)+1);
					
				}
				else
				{
					charCountMap.put(c, 1);
					
				}
			}
			return charCountMap;
			
				
		}
	}
}
public class excercise2 {
	public static void main(String[] args)
	{
		
		HelperClass hc=new HelperClass();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] hr= str.toCharArray();
		HashMap hss=hc.countCharacter(hr);
		System.out.println(hss);
		
	}

}
