package square;

import java.util.Scanner;

public class HollowSquare {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int i,j;
		
		for(i=1; i<=rows; i++) {
			for(j=1; j<=cols; j++) {
				
				if((i==1||i==cols)||(j==1||j==cols)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
