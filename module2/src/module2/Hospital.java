package module2;

import java.util.Scanner;

public class Hospital {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose the Doctor type : Ortho or Padietric or ENT");
		String patientType = scanner.next();
		Doctor doctor = null;
		if (  patientType.equalsIgnoreCase("Orthopedician") || 
			  patientType.equalsIgnoreCase("Padietrician") || 
			  patientType.equalsIgnoreCase("ENTDoc") ||
			  patientType.equalsIgnoreCase("Opthalmologist") ) {
			//doctor = (Doctor) Class.forName(patientType).newInstance();
			
			switch (patientType) {
			case "Orthopedician":
				doctor = new OrthoPedician();
				break;
			case "Padietrician":
				doctor = new Padietrician();
				break;
			case "ENTDoc":
				doctor = new ENTDoc();
				break;
					default:
				break;
			}
		
				
			//doctor.treatPatient();
			System.out.println(doctor.calcSalary());;
		} else {
			System.out.println("Please choose the correct option..");
		}
		scanner.close();
	}
}
