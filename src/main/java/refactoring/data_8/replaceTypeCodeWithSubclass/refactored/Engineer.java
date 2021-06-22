package refactoring.data_8.replaceTypeCodeWithSubclass.refactored;

public class Engineer extends Employee {
	protected Engineer() {
		
	}
	int getType() {
		return Employee.ENGINEER;
	}
	
	public long cacSalary(long base) {
		return base + getOvertimeFee();
	}
	
	private long getOvertimeFee() {
		// 残業代計算処理
		return 0;
	}
}
