package refactoring.data_8.encapsulateCollection.prev;

import java.util.HashSet;


public class SomeClient {
	public void clientMethod() {
		Person kend = new Person();
		HashSet<Course> cources = new HashSet<Course>();
		cources.add(new Course("Java プログラミング", false));
		cources.add(new Course("炎舞をによるモチベーション向上プラクティス", true));
		kend.setCources(cources);
		System.out.println("kentがとったコースの数は " + kend.getCources().size()+ " 個です");
		Course refact = new Course("リファクタリング", true);
		kend.getCources().add(refact);
		kend.getCources().add(new Course("鹿島神道流による殲滅術", false));
		System.out.println("kentがとったコースの数は " + kend.getCources().size()+ " 個です");
		kend.getCources().remove(refact);
		System.out.println("kentがとったコースの数は " + kend.getCources().size()+ " 個です");
		
	}
	
	public void someLongClientMethod(Person person) {
		//～大変に長い処理～
		int count = 0;
		for (Course cource : person.getCources()) {
			if(cource.isAdvanced()) count ++;
		}
		//～大変に長い処理～
	}
}
