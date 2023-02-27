package feb27;
public class Assignment {
	public static void main(String[] args){  
		int n,i,j,isprime;
		System.out.println("Prime numbers between 1 & 150 are:");
		for (i=2;i<=150;i++) { // first for loop for every no. b/w 1 to 150
		isprime=0;
			for( j=2;j<=i/2;j++) {
				if (i%j==0) {
					isprime=1;
				break;	
				}	
			}
			if (isprime==0) {
				System.out.print(i+" ");
			}
		}}}
