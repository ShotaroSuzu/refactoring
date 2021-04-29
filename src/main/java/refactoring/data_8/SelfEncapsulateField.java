package refactoring.data_8;

public class SelfEncapsulateField {
	private int low;
	private int hight;
	
	boolean includes(int arg) {
		return arg >= low && arg <=hight;
	}
	
	void grow(int factor) {
		hight = hight * factor;
	}
	public SelfEncapsulateField(int low, int hight) {
		this.low = low;
		this.hight = hight;
	}
}
