package leetCodeEasy;

public class SolutionLCP {
	
	public static String LCP(String[] arr) {
		String pre = arr[0];
		for(int i=1; i<arr.length; i++) {
			pre = wordByword(pre, arr[i]);
		}
		return pre;
	}

	private static String wordByword(String s1, String s2) {
		// TODO Auto-generated method stub
		String result ="";
		for(int i=0,j=0; i<s1.length() && j<s2.length(); i++,j++) {
			if(s1.charAt(i) != s2.charAt(j))
				break;
			result += s1.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"geeksforgeeks", "geeks",  
                "geek", "geezer"}; 
		System.out.println(LCP(arr));
	}

}
