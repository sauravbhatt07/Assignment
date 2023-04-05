package April05IO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
	public class Assignment2{ //main class 
		public static void main(String[] args) throws IOException { 
			//taking scanner for user input
			Scanner in = new Scanner(System.in);
			System.out.println("Enter 1 to store data:-");
			int i =in.nextInt();
		// for storing data
			if (i==1) {
				FileOutputStream fos = new FileOutputStream("D:\\11.txt");
				String s ="Program stroing & writing data. "; 
				byte b[] = s.getBytes(); 
				fos.write(b); 
				fos.close();
				System.out.println("Storing data complete.");	
				}
			else { System.out.println("wrong keyword.");
			}
			System.out.println("Enter 2 to write data:-");
			int j=in.nextInt();
		// for writing data	
			if (j==2) {
					// file source
					FileInputStream fis = new FileInputStream("D:\\11.txt");
					int k=0;
					while((i=fis.read())!=-1) { // loop for take all characters 
						System.out.print((char)i); 
					}}}}

			