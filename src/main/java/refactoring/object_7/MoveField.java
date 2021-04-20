package refactoring.object_7;

public class MoveField {

	class Account {
		private AccountType type;
		private double interestRate;
		double interestForAmout_days(double amount, int days) {
			return interestRate * amount * days / 365;
		}
	}
	public class AccountType {
		
	}
}
