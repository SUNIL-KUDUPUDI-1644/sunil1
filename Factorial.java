import java.util.function.Function;

public class Factorial {
	public static void  main(String[] arg)
	{
	
		Factorial p=new Factorial();
		Function<Integer,Integer> h=p::fact1;
			int y=h.apply(5);
			System.out.println(y);
		
	}
			public int fact1(int x)
			{

	int factres=1;	

		
				for(int i=1;i<=x;i++)
				{
					factres=factres*i;
				}
				 return  factres;
}
}
