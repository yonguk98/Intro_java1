import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class instanceapp{
	public static void main(String[] args)  throws FileNotFoundException {
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("hello 1");
		p1.close();
	}
}