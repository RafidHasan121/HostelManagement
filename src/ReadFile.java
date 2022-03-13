import java.io.File;
import java.util.Scanner;

public class ReadFile {
	private static Scanner sc;
	public int size;
	public void openfile() {
		try {
			sc = new Scanner(new File ("C:\\Users\\rafid\\eclipse-workspace\\Project Lab\\Management.txt"));
			System.out.println("File found and ready to read");
		}	catch (Exception e) {
			System.out.println("Could not find file");
			System.exit(0);
		}
	}
	
	public Student[] readfile(Student [] s) {
		int i=0;
		while (sc.hasNext()) {
			int a = sc.nextInt();
			String b = sc.next();
			String c = sc.next();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			int g = sc.nextInt();
			s[i] = new Student (a,b,c,d,e,f,g);
			size =i;
			i++;
			
		}
		
		
		return s;
	}

}
