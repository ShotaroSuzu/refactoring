package refactoring.simplify_method_call_10.ReplaceParameterWithExplicitMethods.prev;


public class Employee {
	public final static int ENGINEER = 0;
	public final static int SALESMAN = 1;
	public final static int MANAGER = 2;
	
	static Employee create(int code) {
		switch (code) {
			case ENGINEER:
				return new Engineer();
			case SALESMAN:
				return new SalesMan();
			case MANAGER:
				return new Manager();
			default:
				throw new IllegalArgumentException("不正な従業員コード");
		}

	}
}
