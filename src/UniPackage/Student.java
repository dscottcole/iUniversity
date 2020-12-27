package UniPackage;

public class Student {
	private int studentId;
	private String name;
	private float qualifyingExamMarks;
	private char residentialStatus;
	private int yearOfEngg;
	
	//Setters
	public void setStudentId(int id) {
		this.studentId = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQualifyingExamMarks(float qem) {
		this.qualifyingExamMarks = qem;
	}
	public void setResidentialStatus(char rs) {
		this.residentialStatus = rs;
	}
	public void setYearOfEngg(int yoe) {
		this.yearOfEngg = yoe;
	}
	
	//getters
	public int getStudentId() {
		System.out.println("Student Id         : " + studentId);
		return studentId;
	}
	public String getName() {
		System.out.println("Student Name       : " + name);
		return name;
	}
	public float getQualifyingExamMarks() {
		System.out.println("Qualifying marks   : " + qualifyingExamMarks);
		return qualifyingExamMarks;
	}
	public char getResidentialstatus() {
		String status = "";
		
		if (residentialStatus == 'H') {
			status = "Hostellers";
		} else if (residentialStatus == 'D') {
			status = "Day Scholar";
		}
		
		System.out.println("Residential status : " + status);
		return residentialStatus;
	}
	public int getYearOfEngg() {
		System.out.println("Year of Engineering: " + yearOfEngg);
		return yearOfEngg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jacob = new Student();
		jacob.setName("Jacob");
		jacob.setStudentId(1001);
		jacob.setQualifyingExamMarks(80);
		jacob.setYearOfEngg(3);
		jacob.setResidentialStatus('H');
		jacob.getName();
		jacob.getStudentId();
		jacob.getQualifyingExamMarks();
		jacob.getYearOfEngg();
		jacob.getResidentialstatus();
	}
}
