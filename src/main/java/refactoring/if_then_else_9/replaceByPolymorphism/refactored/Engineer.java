package refactoring.if_then_else_9.replaceByPolymorphism.refactored;


public class Engineer extends EmployeeType {

	@Override
	int getTypeCode() {
		return ENGINEER;
	}
	
	@Override
	long payAmount(Employee emp) {
		return emp.getMonthlySalary() + emp.getOvertimeFee();
	}
}
