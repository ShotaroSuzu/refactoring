package refactoring.object_7;

public class ExtractClass {
	class Person {
		private String name;
		private String oficeAreaCode;
		private String officeNumber;
		String getName() {
			return name;
		}
		String getOficeAreaCode() {
			return oficeAreaCode;
		}
		void setOficeAreaCode(String oficeAreaCode) {
			this.oficeAreaCode = oficeAreaCode;
		}
		String getOfficeNumber() {
			return officeNumber;
		}
		void setOfficeNumber(String officeNumber) {
			this.officeNumber = officeNumber;
		}
		public String getTelephoneNumber() {
			return ("(" + oficeAreaCode + ")" + officeNumber);
		}
	}
}
