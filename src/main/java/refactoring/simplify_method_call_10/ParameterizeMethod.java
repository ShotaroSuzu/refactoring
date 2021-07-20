package refactoring.simplify_method_call_10;

public class ParameterizeMethod {

	private double salary;
	void tenPercentRaise() {
		salary *= 1.1;
	}
	void fivePercentRaise() {
		salary *= 1.05;
	}
	
	
	Dollars baseCharge() {
		double result = Math.min(lastUsage(), 100) * 0.03;
		if(lastUsage() > 100) {
			result += (Math.min(lastUsage(), 200) - 100) * 0.05;
		}
		if(lastUsage() > 200) {
			result += (lastUsage() - 200) * 0.07;
		}
		return new Dollars(result);
	}
	private int lastUsage() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	public class Dollars {

		public Dollars(double result) {
			// TODO 自動生成されたコンストラクター・スタブ
		}

	}
}
