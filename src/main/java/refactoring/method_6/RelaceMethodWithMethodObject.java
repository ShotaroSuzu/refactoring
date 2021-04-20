package refactoring.method_6;

public class RelaceMethodWithMethodObject {
	int someLongLongLongMethod(int inputVal, int quantity, int yearToDate) {
		int importantValue1 = (inputVal * quantity) + someMethod();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if((yearToDate - importantValue1) > 100) {
			importantValue2 -= 20;
		}
		int importantValue3 = importantValue2 * 7;
		
		//以降もめちゃめちゃ長い処理が続くため省略
		// ～略～
		
		return importantValue3 - 2 * importantValue1;
	}

	private int someMethod() {
		return 0;
	}
}
