package refactoring.method_6;

public class IntroduceExplainingVariable {
	
	private int quantity;
	private double itemPrice;

	double price() {
		//価格(price)は、基本価格(base price) - 数量割引(quantity discount) + 送料(shipping)
		return quantity * itemPrice - 
				Math.max(0,  quantity - 500) * itemPrice * 0.05 + 
				Math.max(quantity * itemPrice * 0.1, 100.0);
	}
}
