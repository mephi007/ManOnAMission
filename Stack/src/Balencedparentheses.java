import java.util.Stack;

public class Balencedparentheses {
	
	static boolean opening(char c) {
		switch(c) {
		case '(':
		case '{':
		case '[':
			return true;
		}
		return false;
		
	}
	static boolean closing(char c) {
		switch(c) {
		case ')':
		case '}':
		case ']':
			return true;
		}
		return false;
		
	}
	
	static int openingPar(char c) {
		switch(c) {
		case '(':
			return 1;
		case '{':
			return 2;
		case '[':
			return 3;
		}
		return -1;
		
	}
	
	static int closingPar(char c) {
		switch(c) {
		case ')':
			return 1;
		case '}':
			return 2;
		case ']':
			return 3;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exp ="[(])";
		Stack<Character> st = new Stack<Character>();
		boolean flag=true;
		
		for(int i=0; i<exp.length(); i++) {
			char c = exp.charAt(i);
			if(opening(c))
				st.push(c);
			else if(closing(c))
			{
				if(closingPar(c) == openingPar(st.peek()))
				{
					st.pop();
				}
				else {
					flag = false;
					break;
				}
			}
		}
		
		if(flag == false)
			System.out.println("Unbalanced");
		else System.out.println("Balanced");

	}
	

}
