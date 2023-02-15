package com.cognizant.shapes;

class Rectangle{
	void calculateArea(int l,int b){
		System.out.println("The Area of the rectangle is calculated using the formula length * breadth");
		//System.out.println("The area of recatangle : "+l*b);
}
}
public class AreaCalculator {
	public static void main(String[] args) {
        Rectangle ar = new Rectangle();
        ar.calculateArea(15, 20);	
	}
}