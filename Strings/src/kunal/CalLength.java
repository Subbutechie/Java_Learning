package kunal;

public class CalLength {
	
	public static void main(String[] args) {
		String str = "asgf";
		System.out.println(len(str));
	}

	private static int len(String str) {
		
		//base
		if(str.equals("")) return 0;
		
		
		return len(str.substring(1))+1;
	}

}
