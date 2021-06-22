package refactoring.data_8.replaceTypeCodeWithSubclass.refactored;

public class Manager extends Employee {
	protected Manager() {
		
	}
	int getType() {
		return Employee.MANAGER;
	}
	
	public long cacSalary(long base) {
		return base * 2;
	}
}
