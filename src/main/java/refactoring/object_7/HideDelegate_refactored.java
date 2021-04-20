package refactoring.object_7;

/**
 * 移譲の隠蔽
 * 
 * クライアントが「あるオブジェクト」の移譲クラスを呼び出している。
 * 
 * 「あるオブジェクト」にメソッドを呼び出して移譲を隠す。
 * cf) Facadeパターン
 */
public class HideDelegate_refactored {
	class SomeClient {
		void someMethod() {
			Person john = new Person();
			//中略
			Person manager = john.getManager();
			//後略
		}
	}
	class Person {
		Department department;

		Department getDepartment() {
			return department;
		}

		void setDepartment(Department department) {
			this.department = department;
		}
		public Person getManager() {
			return department.getManamger();
		}
	}
	class Department {
		private String chargeCode;
		private Person manager;
		public Department(Person manager) {
			this.manager = manager;
		}
		public Person getManamger() {
			return manager;
		}
	}

}
