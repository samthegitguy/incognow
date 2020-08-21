package incogcaller;
class SecondaryThread extends Thread 
{ 
	public void run() 
	{ 
		try
		{ 
            incognitor.center obj = new incognitor.center();  //using fully qualified name  
            obj.incognito();  
		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

// Main Class 
public class index
{ 
	public static void main(String[] args) throws InterruptedException
	{ 
		int n = 3; // Number of threads 
		for (int i=0; i<n; i++) 
		{ 
			SecondaryThread object = new SecondaryThread(); 
			object.start(); 
        } 
        System.out.println("Incognito mode initializing.");
        System.out.print("Progress: [#");
        for(int i=0;i<100;i++){ 
        System.out.print("#");
        Thread.sleep(50);
        }
        System.out.print("#]");
	} 
} 
