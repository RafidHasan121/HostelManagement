
import java.io.*;
import javax.swing.JOptionPane;

public class Xo {

	public static void main(String[] args) throws IOException {
		CreateFile x = new CreateFile ();
		ReadFile r = new ReadFile ();
		r.openfile();
		Student [] st = new Student[100];	int c,count;
		st = r.readfile(st);
		int i=r.size;
		System.out.println(i);
		String[] One = {"Drop Down...","Add Student" , "Manage Student"};
		String[] Two = {"Change Name", "Change ID", "Change Institution", "Change Balance", "Change Room","Full Student Information"};
		String inp = (String) JOptionPane.showInputDialog(null, "Choose Option:" , "Student Management Program", JOptionPane.QUESTION_MESSAGE, null, One, One[0]);
		if (inp == One[0])
			JOptionPane.showMessageDialog(null, "Invalid Input, Rerun Program");
		else if (inp == One[1]) {
			i++;
			st[i] = create (st,(i));
		}
		else if (inp == One[2]) {
			String in = (String) JOptionPane.showInputDialog(null, null, "Managing Student", JOptionPane.QUESTION_MESSAGE, null, Two, Two[5]);
			if (in == Two[0]) {
				in= JOptionPane.showInputDialog("Enter Current Name");
				c = find(st, in, i);
				if (c== -1) {
					System.out.println("Entry Not Found");
					System.exit(0);
				}
				in = JOptionPane.showInputDialog("Enter New Name");
				st[c].setName(in);
				System.out.println("Operation Done successfully");
			}
			if (in == Two[1]) {
				in= JOptionPane.showInputDialog("Enter Current Name");
				c = find(st, in, i);
				if (c== -1) {
					System.out.println("Entry Not Found");
					System.exit(0);
				}
				in = JOptionPane.showInputDialog("Enter New ID");
				count = Integer.parseInt(in);
				st[c].setID(count);
				System.out.println("Operation Done successfully");
			}
			if (in == Two[2]) {
				in = JOptionPane.showInputDialog("Enter Current Name");
				c = find (st, in, i);
				if (c== -1) {
					System.out.println("Entry Not Found");
					System.exit(0);
				}
				in = JOptionPane.showInputDialog("Enter New Institution");
				st[c].setInstitution(in);
				System.out.println("Operation Done successfully");
			}
			if (in == Two[3]) {
				in= JOptionPane.showInputDialog("Enter Current Name");
				c = find(st, in, i);
				if (c== -1) {
					System.out.println("Entry Not Found");
					System.exit(0);
				}
				in = JOptionPane.showInputDialog("Enter New Balance");
				count = Integer.parseInt(in);
				st[c].setBalance(count);
				System.out.println("Operation Done successfully");
			}
			if (in == Two[4]) {
				in= JOptionPane.showInputDialog("Enter Current Name");
				c = find(st, in, i);
				if (c== -1) {
					System.out.println("Entry Not Found");
					System.exit(0);
				}
				in = JOptionPane.showInputDialog("Enter New Room Number");
				count = Integer.parseInt(in);
				st[c].setRoomNum(count);
				System.out.println("Operation Done successfully");
			}
			if (in == Two[5]) {
				in = JOptionPane.showInputDialog("Enter Current Name");
				c = find(st, in, i);
				if (c== -1) {
					System.out.println("Entry Not Found");
					System.exit(0);
					}
				JOptionPane.showMessageDialog(null, "Printed In console");
				System.out.println(st[c].toString());
				}				
			}	
			write2file(x, st, i);	
				
				
		}
		
							
	public static Student create (Student [] st, int x) {
		String id = JOptionPane.showInputDialog("ID");
		int newid = Integer.parseInt(id);
		String n = JOptionPane.showInputDialog("NAME");
		String inst = JOptionPane.showInputDialog("INSTITUTION");
		String rn = JOptionPane.showInputDialog("ROOM NO.");
		int newrn = Integer.parseInt(rn);
		String blnc = JOptionPane.showInputDialog("BALANCE");
		int newblnc = Integer.parseInt(blnc);
		String dur = JOptionPane.showInputDialog("DURATION OF STAY");
		int newdur = Integer.parseInt(dur);
		String f = JOptionPane.showInputDialog("FEE");
		int newf = Integer.parseInt(f);
		st[x] = new Student ( newid, n, inst, newrn, newblnc, newdur, newf);
		return st[x];
		}
	
	
	public static int find (Student [] st, String x, int len) {
		int a= -1, c;
		for (c=0; c<=len; c++) {
			if (x.equals((st[c].getName()))) {
				a=c;
				break;
			}
		}
		return a;
	}

	public static void write2file (CreateFile x,Student [] st , int i) {
		x.create();
		for (int qwe=0; qwe<=i; qwe++) {
			x.write(st[qwe].String2File());
		}
		x.close();
	}
		
}			


