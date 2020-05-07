package formulae;

import java.util.Scanner;

public class AreaOfRhombus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double diagonal_1,diagonal_2,area;

		System.out.println("Enter the DIAGONALS of the Rhombus : ");
		diagonal_1 = sc.nextDouble();
		diagonal_2 = sc.nextDouble();

		area = 0.5 * diagonal_1 * diagonal_2;
		
		System.out.println("Area of the Rhombus is : "+area);
	}
}

/*
Output:
	Enter the Diagonals of the Rhombus : 
		5
		10
		Area of the Rhombus is : 25.0
*/