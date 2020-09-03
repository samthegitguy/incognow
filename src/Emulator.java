import java.io.IOException;
import java.time.Instant;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
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
	static String reader(final String readType) throws IOException {
		System.out.println("What is your " + readType + "?");
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final String output = reader.readLine();
		return output;
	}

	public static void main(final String[] args) throws InterruptedException, IOException {
		/**
		 * Displays progress bar while the child thread runs the actual program.
		 *
		 */
		final Runnable r = new MyRunnable(reader("username"), reader("email"), reader("password"));
		new Thread(r).start();
        System.out.println("Incognito mode initializing.");
        System.out.print("Progress: [#");
		for(int i=0;i<100;i++)
		{ 
        	System.out.print("#");
        	Thread.sleep(50);
        	}
        	System.out.print("#]");
		try{
			createfile();
		}
		catch(IOException err){System.out.print(err);}
		finally{}
	}
	public static File createfile() throws IOException 
	{
		long filename = Instant.now().getEpochSecond();
		File myFile = new File(filename + ".dat");
		myFile.createNewFile();
		return(myFile);
	}
} 
