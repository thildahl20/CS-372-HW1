package areaCircle;

import java.util.Scanner;

public class areaCircle {

	public static void main(String[] args) {
		
	final float PI = 3.14f;
	System.out.printf("Input a radius of a circle ");
	
//Input the radius of the circle
	Scanner input = new Scanner(System.in);
	int radius = input.nextInt();
	
//Calculate the area using the radius and the PI (3.14)
	float Area = (PI * radius * radius);

	System.out.printf("The area of the circle is %f", Area);

	}
}
