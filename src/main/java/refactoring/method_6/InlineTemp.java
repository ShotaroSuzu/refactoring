package refactoring.method_6;


public class InlineTemp {
	private Order anyOrder;
	public boolean someMethod() {
		double basePrice = anyOrder.basePrice();
		return basePrice > 1000;
	}
	class Order {
		public double basePrice() {
			return 0;
		}
	}
}
