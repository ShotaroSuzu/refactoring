package refactoring.data_8;

public class ReplaceArrayWithObject {
	String[] row = new String[3];
	public ReplaceArrayWithObject() {
		row[0] = "*";
		row[1] = "15";
	}
	public void printSeparator() {
		for (int i = 0; i < Integer.parseInt(row[1]); i++) {
			System.out.print(row[0]);
			
		}
	}
}
