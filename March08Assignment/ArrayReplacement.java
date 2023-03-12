package March08Assignment;
import java.util.Scanner;
public class ArrayReplacement {
		    public static void main(String[] args)    {
		        Scanner in=new Scanner(System.in);
		        System.out.println("Enter the number of elements :");
		        int length=in.nextInt();    //Array Size Initialization	        
		        int arr[]=new int[length];    //Array Declaration
		        System.out.println("Enter the elements of the array :");
		        for(int i=0;i<length;i++)  {   //Array Initialization
		        
		            arr[i]=in.nextInt();
		        }
		        System.out.println("Enter the number to be remove: ");
		        int e = in.nextInt();
		    
		    for(int i = 0; i < arr.length; i++)   {
		      if(arr[i] == e)   //If element found
		      {
		        // shifting elements
	        for(int j = i; j < arr.length - 1; j++) {	        
		            arr[j] = arr[j+1];
		            arr[j+1]=0;
		        }
		        break;
		      }
		    }	      
		       System.out.println("After removing element: " );
		       for(int i = 0; i < arr.length-1; i++)
		       {
		             System.out.print(arr[i]+ " ");
		       }}}
		    
