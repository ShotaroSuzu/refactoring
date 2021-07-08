package refactoring.if_then_else_9;

/**
 * ガード節による入れ子条件記述の置き換え
 * 
 * メインケースと例外ケースを分離し、例外ケースをさっさとreturnしてしまう。
 * このreturnする部分のところをガード節と呼ぶ
 *
 * 一見できなそうに見える時でも、条件を逆の条件にすることで全体がすっきりし、ガード節を導入しやすくなるケースがある。
 */
public class ReplaceNestedConditionalWithGuardClauses_refactored {
	private boolean isDead;
	private boolean isSeparated;
	private boolean isRetired;

	double getPayAmount() {
		if(isDead) return deadAmount();
		if(isSeparated) return separatedAmount();
		if(isRetired) return retiredAmount();
		return normalPayAmount();
	}
	
	private static final double ADJ_FACTOR = 0;
	private double captial;
	private double intRate;
	private double duration;
	private double income;

	
	private static final double NON_CAPITAL = 0.0;
	double getAdjustedCapital() {
		if(captial <= 0.0) return NON_CAPITAL;
		if(intRate <= 0.0 || duration <= 0.0) return NON_CAPITAL;// !(A∩B) = !A∪!B (条件に否定があるとよみづらくなるので消す)
		return  (income / duration) * ADJ_FACTOR;
	}

	private double normalPayAmount() {
		// 省略
		return 0;
	}

	private double retiredAmount() {
		// 省略
		return 0;
	}

	private double separatedAmount() {
		// 省略
		return 0;
	}

	private double deadAmount() {
		// 省略
		return 0;
	}
}
