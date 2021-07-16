package refactoring.simplify_method_call_10;

import java.util.List;

public class SeparateQueryFromModifier {
	String foundMiscreant(List<String> people) {
		for (String person : people) {
			if(person.equals("Don")) {
				sendAlert();
				return "Don";
			}
			if(person.equals("Gilda")) {
				sendAlert();
				return "Gilda";
			}
		}
		return "";
	}
	

	void mamaCheck(List<String> people) {
		String found = foundMiscreant(people);
		someLaterCode(found);
	}

	private void someLaterCode(String found) {
		// TODO Auto-generated method stub
		
	}

	private void sendAlert() {
		// TODO Auto-generated method stub
		
	}

}
