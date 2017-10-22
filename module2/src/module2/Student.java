package module2;

public class Student {
	
	String firstName;
	String lastName;
	int grade;
	String address;
	int daysAttended;
	
	//Constructor
	Student(String firstName, String lastName, int grade, String address){
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.address = address;
	}
	//Constructor
	Student(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//Constructor
	Student(String firstName, String lastName, int grade){
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
	
	public int getDaysAttended() {
		return daysAttended;
	}
	public void setDaysAttended(int daysAttended) {
		this.daysAttended = daysAttended;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getGrade() {
		return grade;
	}
//	public void setGrade(int grade) {
//		this.grade = grade;
//	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void attendSchool(){
		daysAttended++;
	}
	
	public void applyLeave(int noOfDays){
		daysAttended = daysAttended - noOfDays;
	}
	
}
