package April07Collection;
import java.util.ArrayList;
// method to store even numbers from 2 to N in an ArrayList and return the ArrayList
public class Assignment1 {
public static ArrayList<Integer> storeEvenNumbers(int N) {
// create an empty ArrayList to store even numbers
ArrayList<Integer>A1 = new ArrayList<>();
// Use For loop from 2 to N 
for (int i = 2; i <= N; i += 2) {
A1.add(i); 
}
return A1; // return the ArrayList containing A1 from 2 to N
}
public static void main(String[] args) { 	// main method 
ArrayList<Integer> E = storeEvenNumbers(30);
System.out.println(E);// print the result of  ArrayList 
}}

