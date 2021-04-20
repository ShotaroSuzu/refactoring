package refactoring.method_6;

import java.util.List;


public class ExtractMethod {
	
	private String name;
	private List<Order> orders;
	
	private void printOwing() {
		double outstanding = 0.0;
		
		//バナーの印刷
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
		
		//未払金の計算
		for (Order order : orders) {
			outstanding += order.getAmount();
		}
		
		//明細の印刷
		System.out.println("name:" + name);
		System.out.println("amount:" + outstanding);
	}

	public class Order {
		private double amount;
		public Order(double amount) {
			this.amount = amount;
		}
		public double getAmount() {
			return amount;
		}
		
	}
}
