package geeksForGeek;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "bbbb";
        Set<Character> set = new HashSet<>();
        int cur =0;
        int slide = 0;
        int prev = 0;
        int max = prev;
        while(cur<s.length() && slide<s.length()){
            if(!set.contains(s.charAt(slide))){
                set.add(s.charAt(slide++));
                max = Math.max(slide-cur, max);
            }
            else{
            	set.remove(s.charAt(cur++));
            }
        }
        System.out.println(max);
	

	}

}
