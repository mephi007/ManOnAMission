package HackerRank4thBadge;

public class savePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int m = 19, s = 2;
		int j = s;
        for(int i=1; i<=m; i++){
            j++;
            if(j>n) j = 1;
        }
        System.out.println(j);
	}

}
