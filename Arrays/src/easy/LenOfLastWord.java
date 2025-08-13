package easy;

public class LenOfLastWord {
	
	public static void main(String[] args) {
		
		String s = "    day";
		System.out.println(s);
		System.out.println(lengthOfLastWord(s));
		
	}
	
	 public static int lengthOfLastWord(String s) {

	        
	        int res =0;

	        s = s.trim();
	        int len = s.length();
	        
	        if(len == 0||len == 1) return len;
	        int  j = len-1;
	        while(j>=0) {
	        	if(j == 0) {
	        		return len;
	        	}
	        	if(s.charAt(j) != ' ') {
	        		
	        	}
	        	else {
	        		res = len-1-j;
	        		break;
	        	}
	        	
	        	j--;
	        }
	        
	        return res;
	        
	    }

}
