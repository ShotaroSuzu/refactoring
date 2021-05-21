package refactoring.data_8.changeValueToReference.refactored;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	private static Map<String, Customer> instances = new HashMap<String, Customer>();
	static void loadCustomer() {
		new Customer("Lemon Carh Hire").stoer();
		new Customer("Associated Coffee Machines").stoer();
		new Customer("Bilston Gasworks").stoer();
	}
	private void stoer() {
		instances.put(this.getName(), this);
		
	}
	private String name;
	private Customer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public static Customer getNamed(String name) {
		return instances.get(name);
	}
}
