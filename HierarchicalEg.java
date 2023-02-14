package Inheritance;
class Baseclass {
	int num = 10;
}
class Subclass1 extends Baseclass{
	int childnum1=100;
}
class Subclass2 extends Baseclass{
	int childnum2=200;
}
class Subclass3 extends Baseclass{
	int childnum3=300;
}
public class HierarchicalEg {
	public static void main(String[] args) {
		Subclass1 childObj1 = new Subclass1 ();
	    Subclass2 childObj2 = new Subclass2 ();
	    Subclass3 childObj3 = new Subclass3 ();
	    System.out.println("num*childnum1 = "+childObj1.childnum1);
	    System.out.println("num*childnum2 = "+childObj2.childnum2);
	    System.out.println("num*childnum3 = "+childObj3.childnum3);
	}}

	