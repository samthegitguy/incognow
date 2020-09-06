import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class reader {
    /**
     * Simplifies the process of reading input from the end-user using
     * BufferedReader and InputStreamReader
     * 
     * @author samthegitguy
     * @param readString
     * @return Input value
     * @throws IOException (caught inside the method)
     */
    public String reader(final String readString) throws IOException {
		System.out.println(readString);
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final String output = reader.readLine();
		return output;
	}
}