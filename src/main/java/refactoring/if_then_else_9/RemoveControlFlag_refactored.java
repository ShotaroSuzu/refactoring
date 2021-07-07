package refactoring.if_then_else_9;

/**
 * 制御フラグの削除
 * ・ロジックから脱出する時の制御フラグをbreakかcontinueで置き換える
 * ・メソッドから抜けても良いときはreturnする
 * ・条件式の部分はメソッドから切り出す
 *
 */
public class RemoveControlFlag_refactored {
	private static final String GILDA = "Gilda";
	private static final String DON = "Don";

	void checkSecurity_break(String[] people) {
		for(int i = 0; i < people.length; i++) {
			if(people[i].equals(DON)) {
				sendAlert();
				break;
			}
			if(people[i].equals(GILDA)) {
				sendAlert();
				break;
			}
		}
		/*	for (String person : people) {// foreachを使ったり、条件式をまとめたりもできる
				if(person.equals(DON) || person.equals(GILDA)) {
					sendAlert();
					break;
				}
			}
		*/
	}

	void checkSecurity_return(String[] people) {
		String found = foundMiscreant(people);
		someLaterCode(found);//後続処理
	}

	private String foundMiscreant(String[] people) {
		for(int i = 0; i < people.length; i++) {
			if(people[i].equals(DON)) {
				sendAlert();
				return DON;
			}
			if(people[i].equals(GILDA)) {
				sendAlert();
				return GILDA;
			}
		}
		/*	for (String person : people) {// foreachを使ったり、条件式をまとめたりもできる
				if(person.equals(DON) || person.equals(GILDA)) {
					sendAlert();
					return person;
				}
			}
		*/		return "";
	}

	
	private void someLaterCode(String found) {
		// 省略
	}

	private void sendAlert() {
		// 省略
		
	}
}
