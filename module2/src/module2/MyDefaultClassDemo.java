package module2;

public class MyDefaultClassDemo {
	 
	 public int i;
	 int j;
	 
	 private int k;
	 
	 public void myPublicMethod()
	 {
		 
	 }
	 
	 private static void myPrivateMethod(){
		 
	 }
	 
	 public void defaultAccessMethod(){
		 
	 }
	 
	 public static void myPublicMethod1()
	 {
		 myPrivateMethod();
	 }
	 
	 static void defaultAccessMethod3(){
		 
	 }
	 
	 protected static void protectedMember(){
		 System.out.println("My package member");
	 }

}

