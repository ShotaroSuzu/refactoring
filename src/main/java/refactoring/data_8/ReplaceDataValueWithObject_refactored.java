package refactoring.data_8;

import java.util.Collection;

/**
 * オブジェクトによるデータ値の置き換え
 * 
 * 実装初期段階では単純な値でも問題なかったが、
 * その値の挙動を複雑にしたいときや振る舞いをもたせたくなる場合がある。
 * 例）電話番号を文字列で扱っていたが、市外局番などをうまく扱うためにオブジェクトにする
 * 
 * その場は値をオブジェクトに置き換える。
 * そして、それぞれのインターフェースは変更せずに、
 * 実装をオブジェクトから使うように変更する。
 * なお、ここの例では置き換えたところで値オブジェクトになるので、
 * 本来は更に値オブジェクトを参照オブジェクトに変更する必要がある。
 *
 */
public class ReplaceDataValueWithObject_refactored {
	class Customer {
		private final String name;
		public Customer(String name) {
			this.name = name;
		}
		String getName() {
			return name;
		}
	}
	//リファクタリング対象のOrderクラス
	class Order {
		private Customer customer;
		public Order(String customer) {
			this.customer = new Customer(customer);
		}
		String getCustomerName() {
			return customer.getName();
		}
		void setCustomer(String customerName) {
			this.customer = new Customer(customerName);
		}
		
	}
	//リファクタリングするクラスを使っているクラス
	class ClientClass {
		private int numberOfOrdersFor(Collection<Order> orders, String customer) {
			int result = 0;
			for (Order order : orders) {
				if(order.getCustomerName().equals(customer)) {
					result ++;
				}
			}
			return result;
		}
		
	}
}
