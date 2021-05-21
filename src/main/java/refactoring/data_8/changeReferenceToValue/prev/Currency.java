package refactoring.data_8.changeReferenceToValue.prev;

import java.util.HashMap;
import java.util.Map;

public class Currency {
	private String code;
	private static Map<String , Currency> currencies = new HashMap<>();

	private Currency(String code) {// private
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	public static Currency get(String code) {// オブジェクトの生成はこのメソッドを使って行われる
		return currencies.get(code);
	}
	
	public static void initialize() {
		// currenciesを初期化する処理
	}
}
