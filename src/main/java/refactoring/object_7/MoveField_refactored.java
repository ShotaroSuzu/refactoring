package refactoring.object_7;
/**
 * フィールドの移動
 * 
 * あるクラスに定義されているフィールドが、
 * 定義しているクラスよりも他のクラスから使われることの方が多い
 * 
 */
public class MoveField_refactored {

	class Account {
		private AccountType type;
		double interestForAmout_days(double amount, int days) {
			return type.getInterestRate() * amount * days / 365;
		}
	}
	public class AccountType {
		private double interestRate;

		public double getInterestRate() {
			return interestRate;
		}

		public void setInterestRate(double interestRate) {
			this.interestRate = interestRate;
		}
		
	}
}
