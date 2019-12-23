package HackerRank4thBadge;

public class taumBday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *3 6
9 1 1

		 */
		int b = 3;
		int w = 6;
		int bc =9;
		int wc = 1;
		int z =1;
		
		int bTw = wc+z;
		int wTb = bc+z;
		int black = Math.min(b, bTw);
		int white = Math.min(w, wTb);

		System.out.println((b*black)+(w*white));

	}

}
