import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/** @author samthegitguy & tjsfdc
 * @since
 * @version pre-alpha
 * 
 * Secondary thread for actual background worker */
class SecondaryThread extends Thread
{ 
	public void run() 
	{ 
		System.out.println("Background worker running");
	} 
} 

// Main Class 
public class Emulator
{ 
	static String reader(String readType) throws IOException
	{
		System.out.println("What is your " + readType + "?");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		String output = reader.readLine();
		System.out.println("Your " + readType + " is: " + output);
		return output;
	}
	public static void main(final String[] args) throws InterruptedException, IOException
	{ 
		/**
		 * Displays progress bar while the child thread runs the actual program.
		 */
		reader("username");
		reader("email");
		reader("password");
		final int n = 1; // Number of threads 
		for (int i=0; i<n; i++) 
		{ /** Starts n amount of secondary threads*/
			final SecondaryThread object = new SecondaryThread(); 
			object.start(); 
        } 
        System.out.println("Incognito mode initializing.");
        System.out.print("Progress: [#");
		for(int i=0;i<100;i++)
		{ 
        	System.out.print("#");
        	Thread.sleep(50);
        }
        System.out.print("#]");
	} 
} 
