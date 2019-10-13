package leetCodeEasy;

public class Solution {
	
public static int value(char c) {
        
            switch(c){
                case 'I': 
                    return 1;
                case 'V' :
                	return	5;
                case 'X': 
                   return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M': 
                    return 1000;
                    
            }
            return -1;
            
        }

public static int romtoInt(String s) {
	int res =0;
	for(int i=0; i<s.length(); i++) {
		int s1 = value(s.charAt(i));
		if(i+1 < s.length()) {
			int s2 = value(s.charAt(i+1));
			
			if(s1 >= s2)
				res += s1;
			else {
				res = res +s2 -s1;
				i++;
			}
		}
		else {
			res = res + s1;
			i++;
		}
	}
	
	return res;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romtoInt("IV"));
	}

}
