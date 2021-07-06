package refactoring.data_8.replaceTypeCodeWithState.prev;

public class Employee {
	private int type;
	public final static int ENGINEER = 0;
	public final static int SALESMAN = 1;
	public final static int MANAGER = 2;
	public Employee(int type) {
		this.type = type;
	}
	private long base;
	long payAmount() {
		switch (type) {
		case ENGINEER: 
			return base + getOvertimeFee();
		case SALESMAN: 
			return base + getCommission();
		case MANAGER:
			return base * 2;
		default:
			throw new IllegalArgumentException("Unexpected value: " + base);
		}
	}
	private long getCommission() {
		// コミッション計算処理
		return 0;
	}

	private long getOvertimeFee() {
		// 残業代計算処理
		return 0;
	}
}
