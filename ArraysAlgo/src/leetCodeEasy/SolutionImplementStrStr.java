package leetCodeEasy;

public class SolutionImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi";
		String needle = "pi";
//		"mississippi"
//		"pi"

		
		int n = needle.length();
		
		for(int i=0; i<=haystack.length() && n <= haystack.length(); i++) {
			String str = haystack.substring(i, n);
			if(str.equals(needle)) {
				System.out.println(i);
				return;
			}
			n++;
		}
		System.out.println(-1);

	}

}
