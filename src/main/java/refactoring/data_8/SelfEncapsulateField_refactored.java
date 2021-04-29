package refactoring.data_8;

/**
 * 自己カプセル化フィールド</br>
 * 
 * 自分のフィールドにアクセスするときに、フィールドを直接使うのではなく、
 * getter, setter を使うようにする。</br>
 * 
 * これにより、
 * ・サブクラスがフィールドにアクセスするときにOverrideできる
 * ・遅延初期化などを行うときに、動きに柔軟性をもたせられる。
 * 　例）Hibernate Proxy がフィールドを使うときに適切な挙動を担保できる
 * 
 * 最初はフィールドにアクセスするようにして、
 * あとから必要に応じてリファクタリングする。(はじめから自己カプセル化する必要はない。)
 * 
 * Eclipseショートカット
 * 対象のフィールドにカーソルをあわせて、
 * Alt + Shift + T → S
 * 
 */
public class SelfEncapsulateField_refactored {
	private int low;
	private int hight;
	
	boolean includes(int arg) {
		return arg >= getLow() && arg <=getHight();
	}
	
	void grow(int factor) {
		setHight(getHight() * factor);
	}
	public SelfEncapsulateField_refactored(int low, int hight) {
		// 通常setterはインスタンス化が完了してから利用されるのて、この場合は直接フィールドに代入
		// または、initializeメソッドを作る。
		this.low = low;
		this.hight = hight;
	}

	private int getLow() {
		return low;
	}

	private void setLow(int low) {
		this.low = low;
	}

	private int getHight() {
		return hight;
	}

	private void setHight(int hight) {
		this.hight = hight;
	}
}
