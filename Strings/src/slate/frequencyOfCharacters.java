package slate;

import java.util.stream.IntStream;

public class frequencyOfCharacters {
	
	public static void main(String[] args) {
		String str = "SubbaReddy";
		frequencyOfCharacters(str);
		//countCharacters(str);
		 findFreq("suBb=!u");
	}


//This method converts the string to lowercase and ignores special characters
	    public static void findFreq(String str){
        int[] freq = new int[26];
        boolean[] seen = new boolean[26];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < str.length(); i++){
            //lowercase conversion
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c - 'Z'+'z');
            }
            //skipping symbols etc
            //Anyway we are converting upper to lowercase, anything out of the lowercase range is not relevant 
            else if(c <'a' || c >'z'){
                continue;
            }
            
            int idx = c -'a';
            if(!seen[idx]){
                seen[idx] = true;
                sb.append(c);
            }
            freq[idx]++;
        }
        
        for(int j = 0 ; j < sb.length(); j++){
            char c = sb.charAt(j);
            int idx = c  -'a';
            System.out.println(c + " : " + freq[idx]);
        }
        
    }

	private static void countCharacters(String str) {
		
		int[] freq = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;
		}
		
		for(int i = 0; i<freq.length; i++) {
			if(freq[i] >0) {
				System.out.println((char)(i) +":" +freq[i]);
			}
		}
	}

	//this works only with one type i.e, upper or lower case
	//Modified to count any case os characters
	private static void frequencyOfCharacters(String str) {
		int[] frquency = new int[52];//26+26
		
		for(int i =0; i<str.length(); i++) {
			
			
			
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				frquency[ch -'a']++;
			}
			else if(Character.isUpperCase(ch)) {
				frquency[ch-'A'+26]++;//+26 to add the upper case letter frequencies from index 27
			}
		}
		
		for (int i = 0; i < 26; i++)
	    {
	      if (frquency[i] != 0)
	      {
	        System.out.print((char)(i + 'a') +":"+frquency[i]);
	      }
	    }
		
		for (int i = 26; i < 52; i++)
	    {
	      if (frquency[i] != 0)
	      {
	        System.out.print((char)(i - 26 + 'A')+":"+frquency[i]);
	      }
	    }
	}
	
	
	
	
}
