	package Method;
	import java.util.*;
	public class Eg2 {
		public static void main(String[] args) {
			// create scanner class
			int num,i;
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the number");
			 num = sc.nextInt();
			// call the method
			findprimeornot(num);
		}
		//crete a methoid
		public static void findprimeornot(int num) {
		int count=0;	
		for(int a=1;a<=num;a++) {	
		if (num%a==0) {
			count++;
		}}
		if(count==2) {
			System.out.println(num+" "+"Prime");
		}
		else {
			System.out.println(num + " "+"Not Prime");
		}
		}
		}




