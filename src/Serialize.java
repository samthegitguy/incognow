import java.io.*;
public class Serialize implements java.io.Serializable {
    static final long serialVersionUID = 42L;
    public void Serializer(final String unserialized) throws IOException, FileNotFoundException 
    {
        FileOutputStream fileOut = new FileOutputStream(".config");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(unserialized);
        out.close();
        fileOut.close();
        System.out.printf("Config file saved.");
    }   
}
