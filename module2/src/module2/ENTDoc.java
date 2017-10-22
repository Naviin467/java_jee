package module2;

public final class ENTDoc extends Doctor{
	
	
	public void scanThroat(){
		System.out.println("Scanning throut");
	}
	public void prescribeMedicine(){
		System.out.println("prescribing medicine");
	}
	
	@Override
	void treatPatient() {
		scanThroat();
		prescribeMedicine();
	}
}
