package refactoring.data_8;

import java.util.Collection;

public class ReplaceDataValueWithObject {
	//リファクタリング対象のOrderクラス
	class Order {
		private String customer;
		public Order(String customer) {
			this.customer = customer;
		}
		String getCustomer() {
			return customer;
		}
		void setCustomer(String customer) {
			this.customer = customer;
		}
		
	}
	//リファクタリングするクラスを使っているクラス
	class ClientClass {
		private int numberOfOrdersFor(Collection<Order> orders, String customer) {
			int result = 0;
			for (Order order : orders) {
				if(order.getCustomer().equals(customer)) {
					result ++;
				}
			}
			return result;
		}
		
	}
}
