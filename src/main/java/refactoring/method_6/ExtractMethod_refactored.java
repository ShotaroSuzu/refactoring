package refactoring.method_6;

import java.util.List;

/**
 * メソッドの抽出
 * ひとまとめにできるコードの塊がある場合は、メソッドとして切り出す。
 * これにより、
 * ・何をやっているのかが明確になる。
 * ・他の場所で同じ処理をしているときはそれが使えるようになる。
 * ・メソッド　の粒度が細かい場合はオーバーライドできたり、移譲が簡単になったりする。
 * 
 * Eclipseショートカット
 * Alt + Shift + M
 * @author cosmo
 *
 */
public class ExtractMethod_refactored {
	
	private String name;
	private List<Order> orders;
	private void printOwing() {
		printBanner();
		double outstanding = getOutstanding(orders);
		printDetails(outstanding);
	}

	private void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}

	private double getOutstanding(List<Order> orders) {
		double outstanding = 0.0;
		for (Order order : orders) {
			outstanding += order.getAmount();
		}
		return outstanding;
	}

	private void printDetails(double outstanding) {
		System.out.println("name:" + name);// ローカル変数が再代入される恐れが無いかどうかは確認する必要がある
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
