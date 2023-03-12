package March08Assignment;
import java.util.Scanner;
public class MaxMin {
			public static void main(String args[]) {
			
	 	   Scanner in = new Scanner(System.in); // creating scanner class 
				System.out.println("Enter Array length: "); // to define array index
				int length = in.nextInt();
				int arr[] =new int[length];
				System.out.println("Enter "+length+" numbers: "); // to define numbers in array
				for (int i=0;i<length;i++) {
					arr[i]=in.nextInt();	
				}		
					max_No(arr); // array is a default object
			 	    min_No(arr); 
				}
		// methods for max and min numbers 
				static void max_No(int array[]) { // method for max number
					int max= array[0];
					for (int i=1; i<array.length; i++)
					if (max<array[i]) 
						max=array[i];
					System.out.println("Maximum no. in array is "+max);
					}

				static void min_No(int array[]) { // method for min number
					int min= array[0];
					for (int i=1; i<array.length; i++)
					if (min>array[i]) 
						min=array[i];
					System.out.println("Minimum no. in array is "+min);
					}

	}
