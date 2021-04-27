package refactoring.method_6;

import java.util.Calendar;

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
public class RemoveAssignmentToParameters_callByValue {
	public static void main(String[] args) {
		numberExample();
		calendarExample();
		
	}
	public static void numberExample() {
		int x = 5;
		triple(x);
		System.out.println("triple 実行後の x の値 : " + x);
	}

	private static void triple(int arg) {
		arg = arg * 3;
		System.out.println("triple 中の arg の値 : " + arg);
	}
	
	public static void calendarExample() {
		Calendar c1 = Calendar.getInstance();
		nextDateUpdate(c1);
		System.out.println("nextDateUpdate 実行後の c1 の値 : " + c1.getTime());
		
		Calendar c2 = Calendar.getInstance();
		nextDateReplace(c2);
		System.out.println("nextDateReplace 実行後の c2 の値 : " + c2.getTime());

	}

	private static void nextDateUpdate(Calendar cal) {
		cal.add(Calendar.DATE, 1);
		System.out.println("nextDateUpdate 中の cal の値 : " + cal.getTime());
	}
	
	private static void nextDateReplace(Calendar cal) {
		cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		System.out.println("nextDateReplace 中の cal の値 : " + cal.getTime());
	}
}
