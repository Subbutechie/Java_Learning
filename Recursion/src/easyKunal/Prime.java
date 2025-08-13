package easyKunal;

public class Prime {
	
	public static void main(String[] args) {
		int num = 15;
		System.out.println(isPrime(num,2));
	}

	private static boolean isPrime(int n,int i) {
		
		//best cases if n<2 return false, if equal to 2 return true
		if(n<=2) {
			return (n==2)? true:false;
		}
		
		if(n%i == 0) return false;
		
		
		//base condition
		if(i > Math.sqrt(n)) return true;
		
		return isPrime(n, i+1);
	}

}
