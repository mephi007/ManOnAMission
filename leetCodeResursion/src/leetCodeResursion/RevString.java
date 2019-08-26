package leetCodeResursion;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h','e','l','l','o'};
        int beg =0;
        int end = s.length-1;
        while(beg < end){
            char temp = s[beg];
            s[beg] = s[end];
            s[end] = temp;
            beg++;
            end--;
        }
        for(char c: s)
        	System.out.println(c);
	}

}
