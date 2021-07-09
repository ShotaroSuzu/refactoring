package refactoring.if_then_else_9.replaceByPolymorphism.refactored;

public class Manager extends EmployeeType {

	@Override
	int getTypeCode() {
		return MANAGER;
	}
	@Override
	long payAmount(Employee emp) {
		return emp.getMonthlySalary() + emp.getCommission();
	}
}
