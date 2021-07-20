package refactoring.simplify_method_call_10;

/**
 * メソッドのパラメタライズ
 * 
 * 複数のメソッドがよく似た振る舞いをしているが、メソッド内部に持つ異なる値に基づいている。
 * このリファクタリングによって、コードの重複を排除し、振る舞いに柔軟性を持たせることができる。
 * 
 */
public class ParameterizeMethod_refactored {

	private double salary;
	void raise(double factor) {
		salary *= (1 + factor);
	}



	Dollars baseCharge() {
		double result = Math.min(lastUsage(), 100) * 0.03;
		result += usageInRange(100, 200) * 0.05;
		result += usageInRange(200, Integer.MAX_VALUE) * 0.07;
		return new Dollars(result);
	}
	private int usageInRange(int start, int end) {
		if(lastUsage() > start) {
			return Math.min(lastUsage(), end) - start;
		} else {
			return 0;
		}
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
