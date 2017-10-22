package module2;

public class StudentClient {
	public static void main(String[] args) {
		Student pradeep = new Student("Pradeep", "Kumar", 6,"Girinagar, Bangalore");
		Student kiran = new Student("Kiran", "Kumar", 8, "Hyderabad, AP");

		
		Student ram = new Student("Ram", "Krishnan");
		
		Student venkat = new Student("Ram", "Krishnan", 9);
		

		for (int i = 0; i < 200; i++) {
			pradeep.attendSchool();
		}
		for (int i = 0; i < 250; i++) {
			kiran.attendSchool();
		}

//		System.out.println(kiran.getDaysAttended());
//		kiran.applyLeave(20);
//		System.out.println(pradeep.getDaysAttended());
//		System.out.println(kiran.getDaysAttended());

		System.out.println(kiran.getFirstName());
		System.out.println(kiran.getGrade());
		
		System.out.println(ram.getFirstName());
		System.out.println(ram.getLastName());
		System.out.println(ram.getGrade());
		MyDefaultClassDemo.defaultAccessMethod3();
		MyDefaultClassDemo.protectedMember();
	}

}
