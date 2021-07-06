package refactoring.data_8.replaceTypeCodeWithClass.refacored;

public enum BloodGroup {
	O(0), A(1), B(2), AB(3);
	
	private int code;
	private BloodGroup(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
}
