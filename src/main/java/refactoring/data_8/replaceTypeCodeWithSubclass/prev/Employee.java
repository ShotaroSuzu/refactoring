package refactoring.data_8.replaceTypeCodeWithSubclass.prev;

public class Employee {
	private int type;
	private final int ENGINEER = 0;
	private final int SALESMAN = 1;
	private final int MANAGER = 2;
	
	public Employee(int type) {
		this.type = type;
	}
	
	public long cacSalary(long base) {
		switch (this.type) {
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
