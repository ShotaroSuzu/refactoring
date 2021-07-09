package refactoring.if_then_else_9;

/**
 * 重複した条件記述の断片の統合
 * ・同じ処理をしているところをif文の外に移動させる
 * ・複数ある場合はメソッドにまとめる
 * ・（ケースにもよるが）条件文をメソッドとして切り出す
 */
public class ConsolidateDuplicateConditionalFragments_refactored {
	private double total;
	private double price;

	public void sendMail() {
		//前処理
		if(isSpecialDeal()) {
			total = price * 0.95;
		} else {
			total = price * 0.98;
		}
		send();
	}

	private void send() {
		// 省略
		
	}

	private boolean isSpecialDeal() {
		// 省略
		return false;
	}
}
