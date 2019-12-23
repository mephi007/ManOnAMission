package HackerRank4thBadge;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		int n=10;
		
		long aCount=0;
		long total=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'a')
				aCount++;
		}
		
		long divisor =  n/s.length();
		
		total = total + (divisor*aCount);
		
		int rem = n%s.length();
		
		for(int i=0; i<rem; i++) {
			if(s.charAt(i) == 'a')
				total++;
		}
		
		System.out.println(total);
	}

}
