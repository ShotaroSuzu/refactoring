package refactoring.data_8.replaceTypeCodeWithSubclass.refactored;

public class Salesman extends Employee {
	protected Salesman() {
	}
	int getType() {
		return Employee.SALESMAN;
	}
	
	public long cacSalary(long base) {
		return base + getCommission();
	}
	
	private long getCommission() {
		// コミッション計算処理
		return 0;
	}

}
