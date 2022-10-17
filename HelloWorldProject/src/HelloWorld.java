import java.util.Arrays;
import java.util.Iterator;

class Solution {
    public boolean isSubsequence(String s, String t) {
    	
    	
		int j = 0;
		for (int i = 0; i < t.length() && j < s.length(); i++) {
			if (s.charAt(j) == t.charAt(i)) {
				j++;
			}
			
		}
		
		return (j == s.length());
    	
    }
}


class HelloWorld {
	public static void main(String[] args) {
		Solution aSolution = new Solution();
		boolean asnwer = aSolution.isSubsequence("acb", "abdcf");
		System.out.print(asnwer);
	}
}
