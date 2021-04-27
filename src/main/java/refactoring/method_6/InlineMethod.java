package refactoring.method_6;

/**
 * メソッドのインライン化：メソッド本体が名前をつけて呼ぶまでもなく明らか。</br>
 * メソッドにすると冗長なのに保守性向上に役立っていないケースに使う。  
 * 
 * 一時変数のメソッド化：
 * @author cosmo
 *
 */
public class InlineMethod {
	private int numberOfLateDeliveries;
	int getRating() {
		return (moreThanFileLateDeliveries()) ? 2: 1;
	}
	
	private boolean moreThanFileLateDeliveries() {
		return numberOfLateDeliveries > 5;
	}
}
