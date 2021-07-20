package refactoring.simplify_method_call_10.ReplaceParameterWithExplicitMethods.prev;

/**
 * Employeeを使うクラス
 */
public class SomeClient {
	private void someMethod() {
		Employee kent = Employee.create(Employee.ENGINEER);
		
		//以下省略
	}
}
