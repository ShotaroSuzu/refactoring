package refactoring.simplify_method_call_10;

/**
 * メソッドによるパラメータの置き換え  
 * 
 * あるオブジェクト委がメソッドを呼び出し、その戻り値を別のメソッドのパラメータとして渡している。
 * そのメソッドはパラメータを渡しているメソッド側でも呼び出すことができる場合にこのリファクタリングを行う。
 * 
 */
public class ReplaceParameterWithMethod_refactored {
	private int quantity;
	private int itemPrice;

	public double getPrice() {
		if(getDiscountLevel() == 2) {
			return getBasePrice() * 0.1;
		} else {
			return getBasePrice() * 0.05;
		}
	}

	private int getBasePrice() {
		int basePrice = quantity * itemPrice;
		return basePrice;
	}

	private int getDiscountLevel() {
		if(quantity > 100) {
			return 2;
		} else {
			return 1;
		}
	}
}
