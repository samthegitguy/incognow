import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/** @author samthegitguy
 * @version pre-alpha */

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
		 *
		 */
		Runnable r = new MyRunnable(reader("username"), reader("email"), reader("password"));
		new Thread(r).start();
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
