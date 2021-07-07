package refactoring.if_then_else_9;

/**
 * 条件記述の統合
 * ・同じ結果を保つ一連の条件判定を一つにまとめる。
 */
public class ConsolidateConditionalExpression_refactored {
	private int seniority;
	private int monthsDisabled;
	private boolean isPartTime;

	double disabilityAmount() {
		if(isPartTime()) return 0;
		//傷病給付金を計算する
		double amount = 0;
		/* 省略 */
		return amount;
	}

	private boolean isPartTime() {
		return seniority < 2 || monthsDisabled > 12 || isPartTime;
	}

	//and条件の例
	double calcRate() {
		if(isFullRate()) {
			return 1;
		}
		return 0.5; // isFullRate() ? 1 : 0.5;
	}
	
	boolean isFullRate() {
		return onVacation() && lengthOfService() > 10;
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
