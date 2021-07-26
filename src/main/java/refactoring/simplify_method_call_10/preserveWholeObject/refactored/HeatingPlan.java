package refactoring.simplify_method_call_10.preserveWholeObject.refactored;

/*
 * もともと二つの数字を受け取っていたのを、Rangeというオブジェクト以を受け渡すようにすることで、
 * メソッドも読みやすくなり、呼び出し元ではオブジェクトが何を持っているのかを意識する必要がなくなった。
 * 
 * さらに、このリファクタリングを行うことによって、Rangeの判定の責務がTempRangeにあった方がよいことがわかるため、
 * より責務分けがきちんとした設計に気づくことができる。
 */
public class HeatingPlan {
	private TempRange range;
	public boolean withinRange(TempRange roomRange) {
		return (roomRange.getLow() >= range.getLow() && roomRange.getHigh() <= range.getHigh());
	}

}
