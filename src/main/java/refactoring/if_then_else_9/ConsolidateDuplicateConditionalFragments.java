package refactoring.if_then_else_9;

public class ConsolidateDuplicateConditionalFragments {
	private double total;
	private double price;

	public void sendMail() {
		//前処理
		if(isSpecialDeal()) {
			total = price * 0.95;
			send();
		} else {
			total = price * 0.98;
			send();
		}
	}

	private void send() {
		// 省略
		
	}

	private boolean isSpecialDeal() {
		// 省略
		return false;
	}
}
