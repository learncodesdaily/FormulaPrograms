package formulae;

import java.util.Scanner;

public class AreaOfParallelogram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double base,altitude,area;

		System.out.println("Enter the BASE and ALTITUDE of the Parallelogram : ");
		base = sc.nextDouble();
		altitude = sc.nextDouble();
		
		area = base * altitude;
		
		System.out.println("Area of the Parallelogram is : "+area);
	}
}

/*
Output :
	
	Enter the BASE and ALTITUDE of the Parallelogram : 
		6
		10
		Area of the Parallelogram is : 60.0

*/