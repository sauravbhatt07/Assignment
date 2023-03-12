package March08Assignment;
import java.util.Scanner;
public class ArrayIndex {
			public static void main(String[] args) {
				Scanner in = new Scanner(System.in); // creating scanner class 
				System.out.println("Enter Array length: "); // to define array index
				int length = in.nextInt();
				int arr[] =new int[length];
				System.out.println("Enter "+length+" numbers: "); // to define numbers in array
				for (int i=0;i<length;i++) {
					arr[i]=in.nextInt();
				}
				System.out.println("Enter the element to find its index: ");// to find array index
				int e=in.nextInt(); // e is a no. which is similar to one of the array number
				for(int i=0;i<length;i++) {
					if(arr[i]==e) { // if the 
						System.out.println("Index of "+e+" is : "+i);
					}}}}
					