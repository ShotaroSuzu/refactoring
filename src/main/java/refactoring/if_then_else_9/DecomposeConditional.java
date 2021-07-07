package refactoring.if_then_else_9;

import java.util.Date;

public class DecomposeConditional {
	private Date summerStart = new Date();
	private Date summerEnd = new Date();
	private long winterRate;
	private long winterServiceCharge;
	private long summerRate;

	public long calcFee(Date date, long quantity) {
		long charge = 0;
		if(date.before(summerStart) || date.after(summerEnd)) {
			charge = quantity * winterRate + winterServiceCharge;
		} else {
			charge = quantity * summerRate;
		}
		return charge;
	}
 }
