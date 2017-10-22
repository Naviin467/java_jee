package module2;

public class Padietrician extends Doctor {
	
	@Override
	public void treatPatient(){
		System.out.println("Treating the Patient");
		performHealthCheck();
		prescribeMedicine();
	}
	
	public void performHealthCheck(){
		System.out.println("Performing health check");
	}
	
	public void prescribeMedicine(){
		System.out.println("Prescribing medicine");
	}

}
