
	import java.util.*;
	public class Exercise3 {
	    public static HashMap<Integer, Integer> getSquare(int[] arr) {
	    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
	    for(int i=0;i<5;i++){
	        h.put(arr[i],arr[i]*arr[i]);      
	    }
	    return h;
	    }
	public static void main(String args[]) {
	    int[] arr=new int[5];
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter numbers");
	    for(int i=0;i<5;i++)
	        arr[i]=sc.nextInt();
	    HashMap<Integer, Integer> h = getSquare(arr);
	    sc.close();
	    System.out.println(h);
	      
	}
	}


