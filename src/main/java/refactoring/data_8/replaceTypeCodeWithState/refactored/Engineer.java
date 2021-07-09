package refactoring.data_8.replaceTypeCodeWithState.refactored;


public class Engineer extends EmployeeType {

	@Override
	int getTypeCode() {
		return ENGINEER;
	}
}
