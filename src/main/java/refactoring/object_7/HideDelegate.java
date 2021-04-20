package refactoring.object_7;

public class HideDelegate {
	class SomeClient {
		void someMethod() {
			Person john = new Person();
			//中略
			Person manager = john.getDepartment().getManager();
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
		
	}
	class Department {
		private String chargeCode;
		private Person manager;
		public Department(Person manager) {
			this.manager = manager;
		}
		public Person getManager() {
			return manager;
		}
	}

}
