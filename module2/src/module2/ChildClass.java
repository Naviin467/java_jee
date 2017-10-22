package module2;

public class ChildClass extends BaseClass {
	
	public void childClassMethod(){
		System.out.println("From the child class..");
	}
	
	public static void main(String[] args) {
		
		// Doctor            //Orthopedecian
		BaseClass childObj = new AnotherChildClass();
		
		
	/*	BaseClass baseObj = new BaseClass();
		baseObj.sayHello();
		baseObj.baseClassMethod();
		
		ChildClass child = new ChildClass();
		child.baseClassMethod();
		child.childClassMethod();
		child.sayHello();
		
		childObj.baseClassMethod();
		childObj.sayHello();*/
		
		//((ChildClass)childObj).childClassMethod();
		//ChildClass childObj3 = new BaseClass();
		
		int i =255;
		//byte b = 125;
		byte b = (byte)i;
		
		System.out.println(b);
		//System.out.println("The value is "+b);
	}

}
