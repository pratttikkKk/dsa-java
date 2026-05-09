

public class OOP2 {
	public static void main(String[] args) {

		Student s1= new Student();
		Student s2= new Student();

		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1.marks);

	}
}
class Student{
	int roll;
	String name;
	float marks;

	Student(){
		this.roll=93;
	this.name="kk";
	this.marks=90.80f;
}
}
