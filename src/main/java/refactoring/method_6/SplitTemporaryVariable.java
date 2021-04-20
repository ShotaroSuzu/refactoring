package refactoring.method_6;

public class SplitTemporaryVariable {
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
		double acc = primaryForce / mass;
		int primaryTime = Math.min(time, delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		int secondaryTime = time - delay;
		if(secondaryTime > 0) {
			double primaryVel = acc * delay;
			acc = (primaryForce + secondaryForce) / mass;
			result += primaryVel * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
		}
		return result;
	}
}
