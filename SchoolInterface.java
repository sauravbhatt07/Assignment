package feb28;

interface Person { // Parent Interface
	 void speak(); // Create  method
}
class Student implements Person { // Child Class 1
	@Override
	public void speak() { // Create method
		int student = 100;
		System.out.println("Number of student :- "+student);
	}}
class Teacher implements Person { // Child Class 2
	@Override
	public void speak() {// Create method
		int teacher = 20;
		System.out.println("Number of teacher :- "+teacher);
	}}
		public class SchoolInterface { // main class
			public static void main(String[] args) {
				Student obj=new Student(); // creating object
				Teacher obj1=new Teacher();// creating object
				obj.speak();
				obj1.speak();
			}}
		
