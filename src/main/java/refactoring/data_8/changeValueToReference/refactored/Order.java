package refactoring.data_8.changeValueToReference.refactored;

public class Order {
	private Customer customer;
	public Order(String customerName) {
		this.customer = Customer.getNamed(customerName);
	}
	public String getCustomerName() {
		return customer.getName();
	}
	public void setCustomer(String customerName) {
		this.customer = Customer.getNamed(customerName);
	}
}
