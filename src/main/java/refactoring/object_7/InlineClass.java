package refactoring.object_7;


public class InlineClass {
	class Person {
		private TelephoneNumber officeTelephoneNumber = new TelephoneNumber();
		private String name;
		String getName() {
			return name;
		}
		public String getTelephoneNumber() {
			return officeTelephoneNumber.getTelephoneNumber();
		}
		TelephoneNumber getOfficeTelephone() {
			return officeTelephoneNumber;
		}
	}
	class TelephoneNumber {
		private String areaCode;
		private String number;

		String getAreaCode() {
			return areaCode;
		}

		void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		String getNumber() {
			return number;
		}

		void setNumber(String number) {
			this.number = number;
		}
		public String getTelephoneNumber() {
			return ("(" + areaCode + ")" + number);
		}
	}
}
