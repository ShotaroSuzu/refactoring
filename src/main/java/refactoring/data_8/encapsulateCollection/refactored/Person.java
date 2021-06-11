package refactoring.data_8.encapsulateCollection.refactored;

import java.util.HashSet;
import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class Person {
	private Set<Course> courses = new HashSet<>();

	Set<Course> getCourses() {
//		return Collections.unmodifiableCollection(courses); Javaの標準ライブラリで書き方
		return ImmutableSet.copyOf(courses);
	}
	// setメソッドの置き換え(今回は初期化でのみ利用されているとする) 
	// 適切な名前に変更
	void initializeCourses(Set<Course> courses) {
		if(courses.isEmpty()) {
			for (Course course : courses) {// addAllでも可
				addCourse(course);
			}
		}
	}
	
	//コレクションに対する更新メソッドを提供する
	public void addCourse(Course course) {
		courses.add(course);
	}
	public void removeCourse(Course course) {
		courses.remove(course);
	}

	public int numberOfAdvancedCources() {
		int count = 0;
		for (Course cource : getCourses()) {
			if(cource.isAdvanced()) count ++;
		}
		return count;
	}
	
	public int numberOfCources() {
		return getCourses().size();
	}
}
