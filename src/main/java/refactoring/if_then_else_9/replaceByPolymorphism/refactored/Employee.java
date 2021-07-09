package refactoring.if_then_else_9.replaceByPolymorphism.refactored;

public class Employee {
	private EmployeeType type;
	public Employee(int type) {
		this.setType(type);
	}
	private long base;
	long payAmount() {
		return type.payAmount(this);
	}
	long getMonthlySalary() {
		return base;
	}
	long getCommission() {
		// コミッション計算処理
		return 0;
	}

	long getOvertimeFee() {
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
