import java.util.Formatter;
public class CreateFile {
	
	Formatter xo ;
	
	public void create() {
		try {
			xo = new Formatter ("C:\\Users\\rafid\\eclipse-workspace\\Project Lab\\Management.txt");
			} 
				catch (Exception e) {
					System.out.println("Error Detected");
		}
	}
	
	public void write (String k) {
		try {
		xo.format ("%s" , k);
		System.out.println("Success");
		}
			catch (NullPointerException q) {
				System.out.println("ERROR WRITING FILE");
			}
	}
	
	public void close () {
		xo.close();
	}

}
