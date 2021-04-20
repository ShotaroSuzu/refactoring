package refactoring.object_7;


public class InlineClass_refactored {
	class Person {
		private String name;
		private String officeAreaCode;
		private String officeNumber;
		String getName() {
			return name;
		}
		public String getTelephoneNumber() {
			return ("(" + officeAreaCode + ")" + officeNumber);
		}
		String getAreaCode() {
			return officeAreaCode;
		}

		void setAreaCode(String areaCode) {
			this.officeAreaCode = areaCode;
		}

		String getNumber() {
			return officeNumber;
		}

		void setNumber(String number) {
			this.officeNumber = number;
		}
	}
}
