package easyKunal;

public class Print1toN {
	
	public static void main(String[] args) {
		printnum(10);
	}

	private static void printnum(int  n) {
		
		if(n ==0) {
			return ;
		}
		
		printnum(n-1);
		System.out.print(n+" ");
	}

}
