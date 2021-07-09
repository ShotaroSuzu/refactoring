package refactoring.if_then_else_9.replaceByPolymorphism.prev;

public class Employee {
	private EmployeeType type;
	public Employee(int type) {
		this.setType(type);
	}
	private long base;
	long payAmount() {
		switch (getType()) {
		case EmployeeType.ENGINEER: 
			return base + getOvertimeFee();
		case EmployeeType.SALESMAN: 
			return base + getCommission();
		case EmployeeType.MANAGER:
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
	private int getType() {
		return type.getTypeCode();
	}
	private void setType(int type) {
		this.type = EmployeeType.newType(type);
	}
}
