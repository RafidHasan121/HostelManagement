
public abstract class Managing{
	private int fee;

	public Managing(int fee) {
		super();
		this.fee = fee;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public abstract int Calc (Student x);
}
