package refactoring.data_8.replaceTypeCodeWithClass.refacored;

public class Person {
	private BloodGroup bloodGroup;

	public Person (BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getBloodGroupCode() {
		return bloodGroup.getCode();
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
}
