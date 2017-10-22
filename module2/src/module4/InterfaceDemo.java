package module4;

import module2.Doctor;

public class InterfaceDemo extends Doctor implements One, Two, Three, MyInterface{
	
	void mydefaultMethod(){
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void treatPatient() {
		// TODO Auto-generated method stub
		
	}

}

interface One{
	void method1();
	
}
interface Two{
	void method2();
}

interface Three{
	void method3();
}

interface MyInterface extends One,Two,Three{
	void method4();
}
