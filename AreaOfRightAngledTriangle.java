package formulae;

import java.util.Scanner;

public class AreaOfRightAngledTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double height,width,area;

		System.out.println("Enter the HEIGHT and WIDTH of the Right Angled Triangle : ");
		height = sc.nextDouble();
		width = sc.nextDouble();
		
		area = 0.5 * height * width;
		
		System.out.println("The area of the Right Angled Triangle is : "+area);
	}
}

/*
Output :
	Enter the HEIGHT and WIDTH of the Right Angled Triangle : 
		5
		10
		The area of the Right Angled Triangle is : 25.0

*/