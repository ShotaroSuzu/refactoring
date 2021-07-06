package refactoring.data_8.replaceTypeCodeWithSubclass.refactored;

public abstract class Employee {
	public final static int ENGINEER = 0;
	public final static int SALESMAN = 1;
	public final static int MANAGER = 2;
	
	static Employee create(int type) {
		if(type == ENGINEER) {
			return new Engineer();
		}
		if(type == SALESMAN) {
			return new Salesman();
		}
		if(type == MANAGER) {
			return new Manager();
		}
		throw new IllegalArgumentException("不正なタイプが指定されました。");
	}
	public abstract long cacSalary(long base);

}
