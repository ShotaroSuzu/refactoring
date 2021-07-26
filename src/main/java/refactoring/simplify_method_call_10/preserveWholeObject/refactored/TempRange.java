package refactoring.simplify_method_call_10.preserveWholeObject.refactored;

public class TempRange {
	int low;
	int high;
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	boolean includes(TempRange roomRange) {
		return roomRange.getLow() >= getLow() && roomRange.getHigh() <= getHigh();
	}
	
}
