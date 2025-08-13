package easyKunal;

public class Multiply2Nums {

	public static void main(String[] args) {
		int x = 22, y = 3;
		
		System.out.println(multiply(x,y));
	}

	private static int multiply(int x, int y) {
		
		if(x<y) {
			return multiply(y, x);
		}
		else if(y != 0) {
			return x+ multiply(x, y-1);
		}
		else {
			return 0;
		}
	}

}
