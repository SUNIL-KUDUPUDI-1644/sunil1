import java.util.*;
	public class Exercise1 {
	    List<Integer> getvalues(HashMap<Integer, String> h) {
	    Set<Integer> s=h.keySet();
	    List<Integer> l=new ArrayList<Integer>(s);
	    Collections.sort(l);
	    return l;
	}
	public static void main(String args[]) {
	    HashMap<Integer, String> h = new HashMap<Integer, String>();
	    h.put(1,"hello");
	    h.put(29,"bharu");
	    h.put(3,"h r u");
	    Exercise1 hm = new Exercise1();
	    List<Integer> l1 = hm.getvalues(h);
	    System.out.println(l1);
	    System.out.println(h);
	}

	 

	 

	 

	 

	 

	 

	 

	}


