package March08Assignment;
import java.util.Scanner;
public class ArrayEvenOdd {
				public static void main(String args[]){  
				Scanner in = new Scanner(System.in); // creating scanner class 
				System.out.println("Enter Array length: "); // to define array index
				int length = in.nextInt();
				int a[] =new int[length];
				System.out.println("Enter "+length+" numbers: "); // to define numbers in array
				for (int i=0;i<length;i++) {
					a[i]=in.nextInt();
				}
			System.out.println();// for new line
			// for odd numbers
			System.out.println("Odd Numbers present in array are:");  
			for(int i=0;i<a.length;i++){  
			if(a[i]%2!=0){  
			System.out.print(a[i]+" ");  
			}  
			}  
			System.out.println(); // for new line
			// for even numbers
			System.out.println("Even Numbers present in array are:");  
			for(int i=0;i<a.length;i++){  
			if(a[i]%2==0){  
			System.out.print(a[i]+" ");  
			}  
			}  
			}} 
