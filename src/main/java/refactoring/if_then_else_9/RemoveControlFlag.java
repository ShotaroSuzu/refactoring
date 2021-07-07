package refactoring.if_then_else_9;

public class RemoveControlFlag {
	void checkSecurity_break(String[] people) {
		boolean found = false;
		for(int i = 0; i < people.length; i++) {
			if(!found) {
				if(people[i].equals("Don")) {
					sendAlert();
					found = true;
				}
				if(people[i].equals("Gilda")) {
					sendAlert();
					found = true;
				}
			}
		}
	}

	void checkSecurity_return(String[] people) {
		String found = "";
		for(int i = 0; i < people.length; i++) {
			if(found.equals("")) {
				if(people[i].equals("Don")) {
					sendAlert();
					found = "Don";
				}
				if(people[i].equals("Gilda")) {
					sendAlert();
					found = "Guilda";
				}
			}
		}
		someLaterCode(found);//後続処理
	}

	
	private void someLaterCode(String found) {
		// 省略
	}

	private void sendAlert() {
		// 省略
		
	}
}
