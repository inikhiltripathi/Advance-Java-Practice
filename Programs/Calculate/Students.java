package Calculate;

public class Students {
	String name;
	int age;
	public Students(String n,int a) {
	   name=n;
	   age=a;
	}
	void show() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	public static void main(String[] args) {
		Students s1=new Students("Ram",20);
		Students s2=new Students("Nikhil",20);
		s1.show();
		s2.show();
	}

}
