package refactoring.data_8.encapsulateCollection;

import java.util.HashSet;
import java.util.Set;

import refactoring.data_8.encapsulateCollection.prev.Course;
import refactoring.data_8.encapsulateCollection.prev.Person;

public class ExampleBadPractise {
	public static void main(String[] args) {
		Person kend = new Person();
		HashSet<Course> cources = new HashSet<Course>();
		cources.add(new Course("Java プログラミング", false));
		cources.add(new Course("炎舞をによるモチベーション向上プラクティス", true));
		kend.setCources(cources);
		System.out.println("kentがとったコースの数は " + kend.getCources().size()+ " 個です");
		Course refact = new Course("リファクタリング", true);
		kend.getCources().add(refact);
		kend.getCources().add(new Course("鹿島神道流による殲滅術", false));
		
		someMethod(kend.getCources());
		
		System.out.println("kentがとったコースの数は " + kend.getCources().size()+ " 個です");
		kend.getCources().remove(refact);
		System.out.println("kentがとったコースの数は " + kend.getCources().size()+ " 個です");
		
	}

	private static void someMethod(Set<Course> cources) {
		cources.clear();
	}
}
