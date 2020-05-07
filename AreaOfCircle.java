package formulae;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int radius;
		double PI = 3.14,area;
		
		System.out.println("Enter the RADIUS of the Circle : ");
		radius = sc.nextInt();
		
		area = PI * radius *radius;
		
		System.out.println("The Area of the Circle is : "+area);
	}
}

/*
Output :
	
	Enter the RADIUS of the Circle : 
		4
		The Area of the Circle is : 50.24
*/