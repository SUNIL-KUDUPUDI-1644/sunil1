package lab10;


	public class Exercise2 implements Runnable {
	    
	    int count=0;
	    
	    public void run()
	    {
	        while(true)
	        {
	            System.out.println("Timer = "+count+" seconds");
	            try {
	                Thread.sleep(1000);
	                count++;
	                if(count==11)
	                {
	                    System.out.println("\nTimer Reset\n");
	                    count=0;
	                }
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	            
	        }
	    }

	 

	 

	 

	    public static void main(String[] args) {
	        
	        Exercise2 obj = new Exercise2();
	        Thread t1 = new Thread(obj);
	        t1.start();
	        
	    }
	}


