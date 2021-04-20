package refactoring.method_6;

/**
 * 一時変数のインライン化
 * 簡単な式によって、一度だけ代入される一時変数があり、それが他のリファクタリングの障害になっている</br>
 * 
 * 「問い合わせによる一時変数の置き換え」の前段階でやるリファクタリング。
 * 
 * Eclipseショートカット
 * Alt + Shift + I：
 */
public class InlineTemp_refactored {
	private Order anyOrder;
	public boolean someMethod() {
		return anyOrder.basePrice() > 1000;
	}
	class Order {
		public double basePrice() {
			return 0;
		}
	}
}
