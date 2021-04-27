package refactoring.method_6;

/**
 * メソッドのインライン化：メソッド本体が名前をつけて呼ぶまでもなく明らか。</br>
 * メソッドにすると冗長なのに保守性向上に役立っていないケースに使う。  
 * 
 * Eclipseショートカット
 * Alt + Shift + I：
 * @author cosmo
 *
 */
public class InlineMethod_refactored {
	private int numberOfLateDeliveries;
	int getRating() {
		return (numberOfLateDeliveries > 5) ? 2: 1;
	}

}
