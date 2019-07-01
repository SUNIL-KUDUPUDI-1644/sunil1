

	import java.util.Comparator;
	import java.util.Scanner;

	interface lambda1{
		public boolean  print(String a, String b);
	}

	public class Ex3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			System.out.println("Enter name "+ name);
			String pass=sc.next();
			System.out.println("Enter password" + pass);
			lambda1 l=(a,b)->{if (a.equals(name)&& b.equals(pass))
				return true;
			else
				return false;
	    };

	      boolean c=l.print("bharu","456");
		
		        System.out.println(c);

	      }
	}




