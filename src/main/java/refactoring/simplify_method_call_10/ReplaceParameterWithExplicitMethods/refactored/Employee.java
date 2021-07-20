package refactoring.simplify_method_call_10.ReplaceParameterWithExplicitMethods.refactored;

/**
 * 明示的なメソッド群によるパラメータの置き換え
 * 
 * 引数に渡す値の役割を呼び出し側が知らなくてはいけないという問題を解決する。
 * また、メソッド内部の条件を除去できるため、コードもすっきりする。
 * 
 * フラグを渡して挙動を変えている場合は、今回の対応方法が有効だったりする。
 * 例）Switch.beOn()の方が、Switch.setState(int state)よりもわかりやすいし、
 * 　　メソッドとしてもシンプルになる。
 */

public class Employee {
	//すべてのcreateをそれぞれのファクトリで置き換えることができたら、タイプコードを抹殺できる。
	/*	public final static int ENGINEER = 0;
		public final static int SALESMAN = 1;
		public final static int MANAGER = 2;
		
		static Employee create(int code) {
			switch (code) {
				case ENGINEER:
					return Employee.createEntineer();
				case SALESMAN:
					return Employee.createSalesman();
				case MANAGER:
					return Employee.createManager();
				default:
					throw new IllegalArgumentException("不正な従業員コード");
			}
		}*/
	static Employee createEntineer() {
		return new Engineer();
	}
	static Employee createSalesman() {
		return new Salesman();
	} 
	static Employee createManager() {
		return new Manager();
	}
}
