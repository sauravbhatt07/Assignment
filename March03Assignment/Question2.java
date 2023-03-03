package March03Assignment;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); // use scanner for taking user input
		System.out.println("Enter the array size :-"); //print array size
		int num=s.nextInt();
		//creating an array
		int a[]=new int [num]; //declaration & instantiation
		System.out.println("Enter the numbers"); // print the number which are taking from the user
		for(int i = 0; i < num; i++) { // use for loop
			a[i] =s.nextInt();
		}
		// make a logic for average value
		double average = 0;
		for(int i = 0; i<num; i++) {
			average = average + a[i];
		}
		average = average/num;
		System.out.println("The average value for given numbers is :-"+average); //print the average numbers
		}
		}


