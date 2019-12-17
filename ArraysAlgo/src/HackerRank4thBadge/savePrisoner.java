package HackerRank4thBadge;

public class savePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int m = 19, s = 2;
		int warnPrisoner = (s+m-1)%n;
		
		if(warnPrisoner == 0) warnPrisoner = n;
		
		System.out.println(warnPrisoner);
	}

}
