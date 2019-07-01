package lab8;

public class Jobseeker {
	public static boolean validate(String name) {
        String str = name.substring(0,name.length()-4);
        if(name.substring(8,name.length()).equals("_job") && str.length()==8) {
            return true;
        }
        else
            return false;
    }
public static void main(String args[]) {
    System.out.println(validate("vyshucap_job"));
}

 

}
 




