package medium;

public class RepetitiveAddOpt {

	public static void main(String[] args) {
		
		System.out.println(singleDigit(721));
	}

	private static int singleDigit(int n) {
		int sum = 0;
		while(n>0 || sum >9) {
		
			//start fresh for every new sum
			if(n == 0) {
				n = sum;
				sum = 0;
			}
			
			sum += n%10;
	        n = n/10;
		}
		return sum;
	}

}
