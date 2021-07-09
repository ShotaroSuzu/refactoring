package refactoring.if_then_else_9.replaceByPolymorphism.refactored;

public class Salesman extends EmployeeType {

	@Override
	int getTypeCode() {
		return SALESMAN;
	}
	@Override
	long payAmount(Employee emp) {
		return emp.getMonthlySalary() * 2;
	}
}
