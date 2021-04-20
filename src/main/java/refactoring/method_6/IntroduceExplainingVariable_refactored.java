package refactoring.method_6;

/**
 * 説明変数の導入
 * 
 * 複雑な式がある場合は、一時変数に一度その値を入れて説明変数とする。
 * 
 * ただし、説明変数の導入ができる場合はメソッドの抽出のほうが良い場合があるので注意。
 * 説明変数にしたい場合は、概念が決まっており、他の場所でも使いたい場合がある。
 *
 * Eclipse ショートカット
 * Alt + Shift + L：ローカル変数の抽出
 * Alt + Shift + M：メソッドの抽出
 * 
 */
public class IntroduceExplainingVariable_refactored {
	
	private int quantity;
	private double itemPrice;

	double price() {
		//価格(price)は、基本価格(base price) - 数量割引(quantity discount) + 送料(shipping)
		double basePrice = basePrice();
		double quantityDiscount = quantityDiscount();
		double shipping = Math.max(basePrice * 0.1, 100.0);
		return basePrice - quantityDiscount + shipping;
	}
	
	double price_extractMethod() {
		//価格(price)は、基本価格(base price) - 数量割引(quantity discount) + 送料(shipping)
		return basePrice() - quantityDiscount() + shipping();
	}

	private double shipping() {
		return Math.max(quantity * itemPrice * 0.1, 100.0);
	}

	private double quantityDiscount() {
		return Math.max(0,  quantity - 500) * itemPrice * 0.05;
	}

	private double basePrice() {
		return quantity * itemPrice;
	}

}
