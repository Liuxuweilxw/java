import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TEST {
    public static void main(String[] args) throws FileNotFoundException{
        function();
    }
    public static void function() throws FileNotFoundException {
        File file=new File("d://a.txt");
        PrintWriter pw=new PrintWriter(file);
        pw.println(100);
        pw.write(100);
        pw.flush();
        pw.close();
    }
}
