package refactoring.data_8.encapsulateCollection.refactored;

import java.util.HashSet;


public class SomeClient {
	public void clientMethod() {
		Person kend = new Person();
		HashSet<Course> cources = new HashSet<Course>();
		cources.add(new Course("Java プログラミング", false));
		cources.add(new Course("炎舞をによるモチベーション向上プラクティス", true));
		kend.initializeCourses(cources);
		System.out.println("kentがとったコースの数は " + kend.numberOfCources()+ " 個です");
		Course refact = new Course("リファクタリング", true);
		kend.addCourse(refact);
		kend.addCourse(new Course("鹿島神道流による殲滅術", false));
		System.out.println("kentがとったコースの数は " + kend.numberOfCources()+ " 個です");
		kend.removeCourse(refact);
		System.out.println("kentがとったコースの数は " + kend.numberOfCources()+ " 個です");
		
	}

	// コースの数はPersonだけが知っているべきなので、該当箇所を抽出してPersonクラスに移動する
	public void someLongClientMethod(Person person) {
		//～大変に長い処理～
//		int count = numberOfAdvancedCources(person);
		int count = person.numberOfAdvancedCources();
		//～大変に長い処理～
	}

	/*	private int numberOfAdvancedCources(Person person) {
			int count = 0;
			for (Course cource : person.getCourses()) {
				if(cource.isAdvanced()) count ++;
			}
			return count;
		}*/

	/*  ほかにもPersonクラスにあるべきものがあれば移動しましょう。
	private int numberOfCources(Person kend) {
		return kend.getCourses().size();
	}
	*/

}
