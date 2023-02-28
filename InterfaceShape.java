package feb28;
interface Shape1 {
	abstract class shape1 {
		abstract void calculateArea();
	}
	class Circle  extends shape1 {
		@Override
		void calculateArea() {
			System.out.println("The shape of circle");
		}}
	class Rectangle extends shape1 {
		@Override
		void calculateArea() {
			System.out.println("The shape of Rictangle");
		}}
	public static void main(String[] args) {
		shape1 obj=new Circle();
		shape1 obj1=new Rectangle();
		obj.calculateArea();
		obj1.calculateArea();
	}}
			
