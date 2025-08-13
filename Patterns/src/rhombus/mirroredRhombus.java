package rhombus;

import java.util.Scanner;

public class mirroredRhombus {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int i,j;
		
	for(i = 1;i<=rows;i++) { //loop for printing rows
		
		for(j = cols; j >= i; j--) { //loop for printing spaces
			System.out.print(" ");
		}
		
		for(j = 1; j<=cols; j++) { //loop for printing stars
			System.out.print("*");
		}
		System.out.println();
	}
		
	}

}
