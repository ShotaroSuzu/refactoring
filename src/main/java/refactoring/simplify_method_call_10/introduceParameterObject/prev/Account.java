package refactoring.simplify_method_call_10.introduceParameterObject.prev;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {
	private List<Entry> entries = new ArrayList();//どこかでセットされる
	double getFlowBetween(Date start, Date end) {
		double result = 0;
		for (Entry entry : entries) {
			if(entry.getChargeDate().equals(start) 
					|| entry.getChargeDate().equals(end) 
					|| entry.getChargeDate().after(start) && entry.getChargeDate().before(end)){
				result += entry.getValue();
			}
		}
		return result;
	}
}
