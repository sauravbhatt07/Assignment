package March22Exception;
public class Assignment {
	public static void main(String[] args) {
		try {
			try {
				// Arithmetic exception
				int i =50/0;
				System.out.println(i);
				}
				catch(Exception e) {
				System.out.println(e);
				}
			finally {
				System.out.println("1st finally block after arithmetic exception ");
			}
				// null pointer exception
				try {
					String s = null;
					System.out.println(s.length());
				}
				catch(Exception e) {
					System.out.println(e);
				}
				finally {
					System.out.println("2nd finally block after null pointer exception");
				}
				// ArrayIndexoutofbound exception
				try {
					int arr [] = new int[5];
					arr[7]=10;
				}
				catch(Exception e) {
					System.out.println(e);
				}
				finally {
					System.out.println("3rd finally block after array index out of bound exception");
				}
			}
			catch(Exception e) {
				System.out.println(e);		
			}
		finally {
			System.out.println("Differernt unchecked exceptions done");
		}
		}
	}