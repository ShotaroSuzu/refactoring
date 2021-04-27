package refactoring.method_6;
/**
 * 問い合わせによる一時変数の置き換え
 * 
 * 式の結果を保持するために一時変数を使っているものを、メソッドに置き換える。
 * これにより、同じ処理を必要とする他の場所でもこの処理を呼び出せる。
 * 
 * 長いメソッドの要因となる一時変数を削除し、可読性を上げる。
 * 
 * Eclipseショートカット
 * ・Alt + Shift + M :メソッドの抽出
 * ・Alt + Shift + I：一時変数のインライン化
 */
public class ReplaceTempWithQuery_refactored {
	private double quantity;
	private double itemPrice;
	private double someMethod() {
		if(basePrice() > 1000) {
			return basePrice() * 0.95;
		} else {
			return basePrice() * 0.98;
		}
	}
	private double basePrice() {
		return quantity * itemPrice;
	}
}
