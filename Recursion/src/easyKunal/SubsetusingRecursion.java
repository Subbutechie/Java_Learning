package easyKunal;

public class SubsetusingRecursion {
	
	public static void main(String[] args) {
		String str = "abc";
		printSubsets("",str);
	}
	
	//Here we follow the pattern of take one character and skip remaining
	static void printSubsets(String p, String up) {
		//base condition
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0); 
		
		
		printSubsets(p+ch, up.substring(1));
		printSubsets(p,up.substring(1));
		
		
		
	}

}
