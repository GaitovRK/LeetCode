import java.util.Arrays;
import java.util.Iterator;

class Solution {
    public boolean isSubsequence(String s, String t) {
    	
    	char[] sChar = s.toCharArray();
    	char[] tChar = t.toCharArray();
    	char[] subArray = new char[s.length()];
    	int m = 0;
    	    
    	for (int i = 0; i < tChar.length; i++) {
    		for ( ; m < sChar.length; m++) {
    			if (tChar[i] == sChar[m]) {
    				subArray[m] = tChar[i];
    				i = m;
    			}
    			

    		}
		}
    	
    	System.out.println(Arrays.equals(subArray, sChar));
		System.out.println(sChar);
		System.out.println(subArray);
    	
//		String sString = String.valueOf(sChar);
//		String subString = String.valueOf(subArray);

//		System.out.println(sString);
//		System.out.println(subString);
		
		
//    	if (sString.equals(subString)) {
//    		return true;
//    	} else {
//    		return false;
//		}
		return true;
        
    }
}


class HelloWorld {
	public static void main(String[] args) {
		Solution aSolution = new Solution();
		boolean asnwer = aSolution.isSubsequence("abc", "abdcf");
		System.out.print(asnwer);
	}
}