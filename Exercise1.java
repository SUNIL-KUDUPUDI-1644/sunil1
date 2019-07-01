package lab10;

	import java.io.*;

	public class Exercise1 implements Runnable{
	    public void run() {
	        FileReader f = null;
	        FileWriter f1 = null;
	        BufferedReader br = null;
	        BufferedWriter bw = null;
	        
	        String line = "";
	        try {
	            f = new FileReader("source.txt");
	            f1 =new FileWriter("‪C:\\Users\\srsathi\\Desktop\\ex1\\ex1.txt", true);
	            br = new BufferedReader(f);
	            bw = new BufferedWriter(f1);
	            line = br.readLine();
	            
	            while(line != null) {
	                System.out.println(line);
	                bw.write(line.toString());
	                bw.flush();
	                line = br.readLine();
	            }
	            f1.close();
	        }
	        catch(Exception e) {
	            System.out.println(e);
	        }
	    }
	    public static void main(String[] args) {
	        Exercise1 obj = new Exercise1();
	        Thread th = new Thread(obj);
	        th.start();
	    }
	}
