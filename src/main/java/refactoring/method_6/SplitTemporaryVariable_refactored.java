package refactoring.method_6;

/**
 * 一時変数の分類
 * ループ変数でも集計変数でもない、何回も代入される一時変数がある場合。
 * 代入ごとに別の一時変数に分ける。
 * 
 * finalをつけることで、再代入している箇所を洗い出す。
 * 再代入以降使われないことを確認するには、検索が必要か？(もう少し良い方法がある気がする...)
 */
public class SplitTemporaryVariable_refactored {
	private double primaryForce;
	private double mass;
	private int delay;
	private double secondaryForce;

	/**
	 * このオブジェクトの移動距離を計算する。
	 * はじめは静止している対象に、最初の力を加える。
	 * しばらくして次の力が加わる。
	 */
	double getDistanceTravelled(int time) {
		double result;
		final double primaryAcc = primaryForce / mass;
		int primaryTime = Math.min(time, delay);
		result = 0.5 * primaryAcc * primaryTime * primaryTime;
		int secondaryTime = time - delay;
		if(secondaryTime > 0) {
			double primaryVel = primaryAcc * delay;
			final double secondaryAcc = (primaryForce + secondaryForce) / mass;
			result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
