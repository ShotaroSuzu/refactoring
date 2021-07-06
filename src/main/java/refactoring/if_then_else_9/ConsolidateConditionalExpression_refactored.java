package refactoring.if_then_else_9;

public class ConsolidateConditionalExpression_refactored {
	private int seniority;
	private int monthsDisabled;
	private boolean isPartTime;

	double disabilityAmount() {
		if (seniority < 2) return 0;
		if (monthsDisabled > 12) return 0;
		if(isPartTime) return 0;
		//傷病給付金を計算する
		double amount = 0;
		/* 省略 */
		return amount;
	}

	//and条件の例
	double calcRate() {
		if(onVacation()) {
			if(lengthOfService() > 10) {
				return 1;
			}
		}
		return 0.5;
	}

	private int lengthOfService() {
		//省略
		return 0;
	}

	private boolean onVacation() {
		//省略
		return false;
	}

	
}
