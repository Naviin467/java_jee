package module2;

import module4.Hobby;

public  class OrthoPedician extends Doctor {
	
	@Override
	public void treatPatient(){
		System.out.println("Treating the Patient");
		readXRayReport();
		performKneeSurgery();
	}
	
	
	public void performKneeSurgery(){
		System.out.println("Performing knee surgery");
	}
	
	public void readXRayReport(){
		System.out.println("Analysing X-Ray report");
	}

}
