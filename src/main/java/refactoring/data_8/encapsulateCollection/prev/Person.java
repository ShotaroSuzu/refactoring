package refactoring.data_8.encapsulateCollection.prev;

import java.util.Set;

public class Person {
	private Set<Course> cources;

	public Set<Course> getCources() {
		return cources;
	}

	public void setCources(Set<Course> cources) {
		this.cources = cources;
	}
}
