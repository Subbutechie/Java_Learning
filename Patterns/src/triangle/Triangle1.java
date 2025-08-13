package triangle;

public class Triangle1 {

	public static void main(String[] args) {
		int n = 4;
		
		for(int i =0; i<4; i++) {
			for(int j=n-i; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
