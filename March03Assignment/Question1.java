package March03Assignment;
import java.util.Scanner;
public class Question1 { //main class
	public static void main(String[] args) {
	int n , sum =0; // take instance variable
	Scanner s= new Scanner(System.in); // use scanner for taking user input
	System.out.println("Enter the array size :-"); //print array size
	n=s.nextInt();
	//creating an array
	int a[]=new int [n]; //declaration & instantiation
	System.out.println("Enter the numbers"); // print the number which are taking from the user
	for(int i = 0; i < n; i++) { // use for loop
		a[i] =s.nextInt();
		sum = sum + a[i];
	}
	System.out.println("The sum is :-"+sum); //print final sum of all numbers
	}
	}
