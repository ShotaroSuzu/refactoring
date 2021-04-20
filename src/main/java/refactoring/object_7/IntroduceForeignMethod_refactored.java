package refactoring.object_7;

import java.util.Date;

/**
 * 外部メソッドの導入
 * 
 * あるサービスクラスにメソッドを追加したいが、そのクラスを変更できない。
 * 
 * ポイント
 * - クライアントクラスの何にもアクセスしない
 * - サーバークラスのインスタンスを第一引数とする
 * - メソッドに「外部メソッド：＜サーバー名＞クラスにあるべき」とコメントをつける
 */
public class IntroduceForeignMethod_refactored {
	// 次の請求期間の処理に移るためのコード
	void someClient() {
		Date previousEnd = new Date();
		//中略
		Date newStart = nextDay(previousEnd);
	}

	private Date nextDay(Date previousEnd) {
		//外部メソッド：Dateクラスにあるべき
		return new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
	}
	
}
