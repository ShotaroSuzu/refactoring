package refactoring.object_7;

import java.util.Date;

/**
 * 外部メソッドの導入
 * 
 * あるサービスクラスにメソッドを追加したいが、そのクラスを変更できない。
 */
public class IntroduceForeignMethod {
	// 次の請求期間の処理に移るためのコード
	void someClient() {
		Date previousEnd = new Date();
		//中略
		Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
	}
}
