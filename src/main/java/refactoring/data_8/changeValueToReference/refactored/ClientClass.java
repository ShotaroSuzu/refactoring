package refactoring.data_8.changeValueToReference.refactored;

import java.util.Collection;

public class ClientClass {
	private static int numberOfOrdersFor(Collection<Order> orders, String customer) {
		int result = 0;
		for (Order order : orders) {
			if(order.getCustomerName().equals(customer)) {
				result ++;
			}
		}
		return result;
	}
}
