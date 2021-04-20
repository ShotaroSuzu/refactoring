package refactoring.method_6;

/**
 * メソッドオブジェクトによるメソッドの置き換え
 * 
 * 長いメソッドで「メソッドの抽出」を適用できないようなローカル変数の使い方をしている場合。
 * メソッド自身をオブジェクトとして、すべてのロカル変数をそのオブジェクトフィールドとすることで、
 * そのオブジェクト内でのメソッド郡に分割できる。
 * 
 * 巨大なメソッドがあるが、取っ掛かりも見つからないほどいリファクタリングが難しい場合に使う。
 * 説明の都合上インナークラスを使うが、本来は完全に別クラスとして切り出す。
 * 
 */
public class RelaceMethodWithMethodObject_refactored {
	int someLongLongLongMethod(int inputVal, int quantity, int yearToDate) {
		return new ExtractedMethodClass(this, inputVal, quantity, yearToDate).compute();
	}

	private int someMethod() {
		return 0;
	}
	
	class ExtractedMethodClass {
		private final RelaceMethodWithMethodObject_refactored originalClass;
		private int inputVal;
		private int quantity;
		private int yearToDate;
		private int importantValue1;
		private int importantValue2;
		private int importantValue3;
		public ExtractedMethodClass(RelaceMethodWithMethodObject_refactored originalClass,
									int inputValArg, int quantityArg, int yearToDateArg) {
			this.originalClass = originalClass;
			this.inputVal = inputValArg;
			this.quantity = quantityArg;
		}
		public int compute() {
			int importantValue1 = (inputVal * quantity) + originalClass.someMethod();
			int importantValue2 = (inputVal * yearToDate) + 100;
			if((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
			int importantValue3 = importantValue2 * 7;
			
			//以降もめちゃめちゃ長い処理が続くため省略
			// ～略～
			
			return importantValue3 - 2 * importantValue1;
		}
	}
}
