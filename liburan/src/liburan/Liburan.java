package liburan;
import java.io.*;

public class Liburan {
    public Liburan(){
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("What is the name the file to be written to?");
        String filename;
        BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
        filename=rd.readLine();
        System.out.println("Enter data to write to "+filename+"...");
        System.out.println("Type q$ to end");
        FileOutputStream fos=null;
        fos=new FileOutputStream(filename);
    }
    
}
