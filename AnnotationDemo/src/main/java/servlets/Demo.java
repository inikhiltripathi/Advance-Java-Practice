package servlets;

public class Demo {

	void m() {
		System.out.println("Class Demo");
	}
	public static void main(String[] args) {
		Demo demo=new Test();
		demo.m();
	}
}
class Test extends Demo{
	@Override
	void m() {
		System.out.println("Class Test");
	}
	
}