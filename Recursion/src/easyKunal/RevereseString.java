package easyKunal;

import java.util.Arrays;

public class RevereseString {

	public static void main(String[] args) {
		char[] s =  {'h','e','l','l','w','r'};
		//System.out.println(Arrays.toString(reversString(s)));
		reverseString(s);
	}

	
	
	public static char[] reversString(char[] s) {
        int i =0;
        int n = s.length;
        while(i<=n/2){
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
            i++;
        }
		return s;
    }
	//--------------------------------------------------
	//recursion
	  public static void reverseString(char[] s) {
	        int index = 0;
	        int n = s.length;
	        helper(s,n,index);
	        System.out.println(Arrays.toString(s));
	    }
	    static char[] helper(char[] s, int n, int index){
	        //base
	        if(index >= n/2) return s ;

	        //swap
	        char temp = s[index];
	        s[index] = s[n-index-1];
	        s[n-index-1] = temp;

	        return helper(s,n,index+1);
	    }

}
