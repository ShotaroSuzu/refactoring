package refactoring.data_8;

/**
 * オブジェクトによる配列の置き換え
 * 
 * 配列の要素が順番に依存した異なる意味を持つ場合は、
 * オブジェクトに置き換える。
 * 
 * 1. クラスを作る
 * 2. public の配列フィールドを作る
 * 3. 配列を使っている部分を1,2で作ったクラスのフィールドを利用するようにする→テスト
 * 4. 1のクラスに配列の一つの要素に対応するgetter/setterを作り、3の箇所を置き換える→テスト
 * 5. 4を配列の要素数分繰り返す→テスト
 * 6. クラス内に配列の各要素に対応するフィールドを作り、getter/setterはそれを使うようにする→テスト
 * 7. すべてのフィールドが追加されたら配列を削除する→テスト
 * 
 * 極力安全にやる方法はこれだが、利用箇所にテストハーネスがある場合は一気にやってしまっても良いかも。。。
 */
public class ReplaceArrayWithObject_refactored {
	Separator row = new Separator();
	public ReplaceArrayWithObject_refactored() {
		row.setToken("*");
		row.setTokenCount("15");
	}
	public void printSeparator() {
		for (int i = 0; i < Integer.parseInt(row.getTokenCount()); i++) {
			System.out.print(row.getToken());
			
		}
	}
	class Separator {
		private String token;
		private String count;
		public String getToken() {
			return token;
		}
		public void setToken(String token) {
			this.token = token;
		}
		public String getTokenCount() {
			return count;
		}
		public void setTokenCount(String count) {
			this.count = count;
		}
	}
}
