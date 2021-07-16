package refactoring.simplify_method_call_10;

import java.util.List;

/**
 * 問い合せと更新の分類</br>
 * 
 * 副作用を持つメソッドと副作用を持たないメソッドを分けましょう。
 * 
 * 手順</br>
 * 1. 元のメソッドを同じ値を返す問い合せメソッドを作る </br>
 * 2． 元のメソッドを修正して新たに作成した問い合せメソッドの戻り値を返すようにする</br>
 * 3. すべての呼び出し元に対して元のメソッドに対する呼び出しを問い合せメソッドの呼び出しで置き換える</br>
 * 4． 問い合せメソッドの呼び出し行の前に元のメソッドに対する呼び出しを追加する。</br>
 * 5. 元のメソッドの戻り値の型をvoidにしてreturn文を削除する</br>
 */
public class SeparateQueryFromModifier_refactored {
	void sendAlert(List<String> people) {
		if(foundPerson(people).equals("")) {
			sendAlert();
		}
	}

	String foundPerson(List<String> people) {
		for (String person : people) {
			if(person.equals("Don")) {
				return "Don";
			}
			if(person.equals("Gilda")) {
				return "Gilda";
			}
		}
		return "";
	}

	void mamaCheck(List<String> people) {
		sendAlert(people);
		String found = foundPerson(people);
		someLaterCode(found);
	}

	private void someLaterCode(String found) {
		// TODO Auto-generated method stub
		
	}

	private void sendAlert() {
		// TODO Auto-generated method stub
		
	}

}
