package easyKunal;

public class FirstUpperCaseLetter {

	public static void main(String[] args) {
		
		String str = "sdZagdfs";
		char ch =printUpper(str,0);
		if(ch == 0) System.out.println("No upper case letter ");
		 System.out.println(ch);
	}

	private static char printUpper(String str, int i) {
		//base condition
		//'\0': This is the null character (also known as the null terminator).
		//It is a special character used in languages like C and C++ to indicate the end of a string.
		if(str.charAt(i) == '\0') return 0;
		
		if(Character.isUpperCase(str.charAt(i)))
			return str.charAt(i);
		try {
			return printUpper(str, i+1);
		}
		catch(Exception e){
			System.out.println("Expection occurs");
		}
		return 0;
		
		
	}

}
