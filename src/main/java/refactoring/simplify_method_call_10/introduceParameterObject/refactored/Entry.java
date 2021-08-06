package refactoring.simplify_method_call_10.introduceParameterObject.refactored;

import java.util.Date;

public class Entry {
	private Date chargeDate;
	private double value;
	
	public Entry(Date chargeDate, double value) {
		super();
		this.chargeDate = chargeDate;
		this.value = value;
	}
	public Date getChargeDate() {
		return chargeDate;
	}
	public double getValue() {
		return value;
	}
}
