package Feb8;
import java.util.Scanner;
public class Assignment3 {
public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter first number: ");
       double n1 = in.nextDouble();
       System.out.print("Enter second number: ");
       double n2 = in.nextDouble();
       
       if ((n1==0 || n1<=1 || n1==1) && (n2==0 || n2<=1 || n2==1)) {
		 System.out.println(n1 +"&"+ n2 +" is between 0 and 1");
		 System.out.println("True");
	}
	 else  {
		 System.out.println(n1 +"&"+ n2 +" is not between 0 and 1");
		 System.out.println("False");
}
}
}