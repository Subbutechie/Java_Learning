package easyKunal;

public class DigitSum {

	public static void main(String[] args) {
		
		int n = 12345;
		System.out.println(sum(n));
	}

	private static int sum(int n) {
		
		return helper(n,0);
	}

	private static int helper(int n, int sum) {
		
		//base condition
		if(n == 0) return sum;
		
		sum = sum + n %10;
		
		return helper(n/10,sum);
	}

}
