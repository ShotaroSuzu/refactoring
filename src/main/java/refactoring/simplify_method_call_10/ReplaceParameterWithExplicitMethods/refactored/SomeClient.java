package refactoring.simplify_method_call_10.ReplaceParameterWithExplicitMethods.refactored;

/**
 * Employeeを使うクラス
 */
public class SomeClient {
	private void someMethod() {
		Employee kent = Employee.createEntineer();
		
		//以下省略
	}
}
