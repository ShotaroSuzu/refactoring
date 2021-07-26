package refactoring.simplify_method_call_10.preserveWholeObject.refactored;

/**
 * ある部屋における1日の最高温度と最低温度を記録するオブジェクト。
 * 現在までの温度範囲とあらかじめ定義された暖房計画の温度範囲とを比較することで適正温度かを判定する。
 */
public class Room {
	boolean withinPlan(HeatingPlan plan) {
		return plan.withinRange(daysTempRange());
	}

	private TempRange daysTempRange() {
		return new TempRange();//Roomに対する処理で適宜TempRangeの値が変わるが、今回はロジック記載を省略。
	}
}
