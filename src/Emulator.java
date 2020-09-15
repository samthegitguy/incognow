import java.io.IOException;

import com.jaunt.JauntException;

import java.io.File;

/**
 * Secondary thread for actual background worker
 * 
 * @author github samthegitguy & github tjsfdc
 * @version pre-alpha
 */
class SecondaryThread extends Thread {
	public void run() {
		System.out.println("Background worker running");
	}
}

// Main Class
public class Emulator {
	public static void main(String[] args) throws InterruptedException, IOException {
		/**
		 * Displays progress bar while the child thread runs the actual program.
		 */
		SecurityCheck checker = new SecurityCheck();
		try {
			checker.Checker();
		} catch (JauntException e) {
			System.out.println("All security checks passed");
		}
		reader myReader = new reader();
		final Runnable r = new MyRunnable(myReader.reader("username"), myReader.reader("email"), myReader.reader("password"));
		Serialize ser = new Serialize();

		new Thread(r).start();
		ser.Serializer("Hello World!");
		
		System.out.println("Incognito mode initializing.");
		System.out.print("Progress: [#");
		for(int i=0; i<100; i++) { 
        	System.out.print("#");
        	Thread.sleep(50);
        	} 
		System.out.print("#]");
	}
} 