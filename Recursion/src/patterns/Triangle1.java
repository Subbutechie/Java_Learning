package patterns;

public class Triangle1 {
	
	public static void main(String[] args) {
		pattern(4,0);
	}

	private static void pattern(int r, int c) {
		//base condition
		if(r==0) return;
		
		if(r>c) {
			System.out.print("*");
			pattern(r,c+1);
		}
		else {
			System.out.println();
			pattern(r-1,0);
		}
		
	}

}
