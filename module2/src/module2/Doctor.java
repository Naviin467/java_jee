package module2;

public abstract  class Doctor {
	
	public abstract void treatPatient();
	
	public void enrollIntoHospital() {
		System.out.println("Enrolling into Hospital");
	}
	
	public final double calcSalary(){
		return 1_00_000;
	}
}
