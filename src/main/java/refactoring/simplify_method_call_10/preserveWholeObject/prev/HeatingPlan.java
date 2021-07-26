package refactoring.simplify_method_call_10.preserveWholeObject.prev;

public class HeatingPlan {
	private TempRange range;
	public boolean withinRange(int low, int high) {
		return (low >= range.getLow() && high <= range.getHigh());
	}

}
