package refactoring.object_7;

/**
 * メソッドの移動
 * 他のクラスの方がそのメソッドを使ったりそのメソッドから使われたりする場合。
 * 
 * メソッドを移動するだけ。
 * 
 * Eclipseショートカット
 * 1. 範囲選択(Alt + Shift + ←or→)
 * 2. Alt + Shift + v
 */
public class MoveMethod_refactored {

	class Account {
		private AccountType type;
		private int daysOverdrawn;
		double overdraftCharge() {
			return type.overdraftCharge(daysOverdrawn);
		}
		double bankCharge()  {
			double result = 4.5;
			if (daysOverdrawn > 0) result += overdraftCharge();
			return result;
		}
	}
	public class AccountType {
		public boolean isPremium() {
			// TODO 自動生成されたメソッド・スタブ
			return false;
		}
		double overdraftCharge(int daysOverdrawn) {
			if (isPremium()) {
				double result = 10;
				if(daysOverdrawn > 7) result += (daysOverdrawn - 7) * 0.85;
				return result;
			}
			else return daysOverdrawn * 1.75;
		}

	}
}
