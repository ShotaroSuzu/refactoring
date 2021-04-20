package refactoring.method_6;


public class ReplaceTempWithQuery {
	private double quantity;
	private double itemPrice;
	private double someMethod() {
		double basePrice = quantity * itemPrice;
		if(basePrice > 1000) {
			return basePrice * 0.95;
		} else {
			return basePrice * 0.98;
		}
	}
}
