
public class Student extends Managing implements Hyhy  {
	private int ID;
	private String name;
	private String institution;
	private int roomNum;
	private int balance;
	private int duration;
	

	public Student(int iD, String name, String institution, int roomNum, int balance, int duration, int fee ) {
		super(fee);
		ID = iD;
		this.name = name;
		this.institution = institution;
		this.roomNum = roomNum;
		this.balance = balance;
		this.duration = duration;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void deposit (int x) {
		balance = balance + x;
		System.out.println("Successfully added balance -" +x);
	}

	@Override
	public int Calc(Student x) {
		return x.getFee()* x.getDuration();
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", institution=" + institution + ", roomNum=" + roomNum
				+ ", balance=" + balance + ", duration=" + duration + ", getFee()=" + getFee() + "]";
	}
	public String String2File() {
		return ID + " "+ name + " "+ institution + " " + roomNum + " " + balance + " " + duration + " " + getFee() + "\n" ;
	}
	
	
	

}
