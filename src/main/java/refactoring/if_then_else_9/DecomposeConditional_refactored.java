package refactoring.if_then_else_9;

import java.util.Date;

/**
 * 条件記述の分解
 * ・条件をメソッドに切り出して意味を持たせる
 * 
 * ほかにも
 * ・isWinterだと期間が分断されるのでisSummerの方がAND条件となりわかりやすい(ケースにもよるがORよりANDの方が読みやすい)
 * ・早めのreturn
 *
 */
public class DecomposeConditional_refactored {
	private Date summerStart = new Date();
	private Date summerEnd = new Date();
	private long winterRate;
	private long winterServiceCharge;
	private long summerRate;

	public long calcFee(Date date, long quantity) {
		if(isSummer(date)) {
			return quantity * summerRate;
		}

		return  quantity * winterRate + winterServiceCharge;
	}

	private boolean isWinter(Date date) {
		return date.before(summerStart) || date.after(summerEnd) ;
	}
	
	private boolean isSummer(Date date) {
		return  date.compareTo(summerStart) > 0 //date > summerStart
				&& date.compareTo(summerEnd) < 0;//date < summerStart
	}

 }
