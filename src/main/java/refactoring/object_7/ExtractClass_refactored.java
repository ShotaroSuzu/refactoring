package refactoring.object_7;

/**
 * クラスの抽出
 * 
 * ２つのクラスでなされるべき作業を1つのクラスで行っている。
 * 
 * 実装した当初は問題なくても、あとから機能を追加したり、
 * 挙動を変更するときにクラスの責務が大きくなってしまう事がある。
 * こういったときは、適切にクラスを分割してあげれば良い。
 * 
 * Eclipseのショートカットはないが、手動でやってもほとんどリスクはない気がする。  
 * クラスを分けたときに、切り出した方のクラスをもともとの呼び出し先でどのように扱うのかは注意が必要。
 * 
 *
 */
public class ExtractClass_refactored {
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
