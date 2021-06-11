package refactoring.data_8.encapsulateCollection.prev;

public class Course {
	private String name;
	private boolean isAdvanced;
	
	public Course(String name, boolean isAdvanced) {
		super();
		this.name = name;
		this.isAdvanced = isAdvanced;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	boolean isAdvanced() {
		return isAdvanced;
	}
	void setAdvanced(boolean isAdvanced) {
		this.isAdvanced = isAdvanced;
	}
}
