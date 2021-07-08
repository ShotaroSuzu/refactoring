package refactoring.if_then_else_9;

public class ReplaceNestedConditionalWithGuardClauses {
	private boolean isDead;
	private boolean isSeparated;
	private boolean isRetired;

	double getPayAmount() {
		double result;
		if(isDead) {
			result = deadAmount();
		} else {
			if(isSeparated) {
				result = separatedAmount();
			} else {
				if(isRetired) {
					result = retiredAmount();
				} else {
					result = normalPayAmount();
				}
			}
		}
		return result;
	}
	
	private static final double ADJ_FACTOR = 0;
	private double captial;
	private double intRate;
	private double duration;
	private double income;

	double getAdjustedCapital() {
		double result = 0.0;
		if(captial > 0.0) {
			if(intRate > 0.0 && duration > 0.0) {
				result = (income / duration) * ADJ_FACTOR;
			}
		}
		return result;
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
