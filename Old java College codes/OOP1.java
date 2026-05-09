public class OOP1 {
	public static void main(String[] args) {

		Student s1= new Student();
		s1.name="pratik";
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.marks);

	}
}
class Student{
	int roll;
	String name;
	float marks;
}
