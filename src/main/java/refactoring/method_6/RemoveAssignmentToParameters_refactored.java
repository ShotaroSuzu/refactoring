package refactoring.method_6;


/**
 * パラメータへの代入の除去
 * パラメータへの再代入はバグの元。
 * また、値渡しなのか、参照渡しなのかによって挙動が変わるため、可読性が低下する。
 * 
 * 
 * ※参考
 * Javaのメソッドでは値渡しが行われている。 
 * →main を実行してみてください。
 * 
 */
public class RemoveAssignmentToParameters_refactored {
	int discount(final int inputVal,final int quantity,final int yearToDate) {
		int result = inputVal;
		if (inputVal > 50) result -= 2;
		if (quantity > 100) result -= 1;
		if (yearToDate > 10000) result -= 4;
		return result;
	}
	
	public static void main(String[] args) {
		int x = 5;
		triple(x);
		System.out.println("triple 実行後の x の値 : " + x);
	}

	private static void triple(int arg) {
		arg = arg * 3;
		System.out.println("triple 中の arg の値 : " + arg);
	}
	
}
