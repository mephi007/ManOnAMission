import java.util.Stack;

public class preToPost {
	
	static boolean isOperator(char c) {
		
		switch(c) {
		case '+':
		case '-':
		case '*':
		case '/':
			return true;
		}
		return false;
	}
	
	static String postFixExp(String exp)
	{
		String res = new String("");
		Stack<String> st = new Stack<>();
		
		for(int i = exp.length()-1; i>=0; i--)
		{
			char c = exp.charAt(i);
			if(isOperator(c)) {
				
				String op1 = st.peek();
				st.pop();
				String op2 = st.peek();
				st.pop();
				res = op1 + op2 + Character.toString(c);
				st.push(res);
			}
			else if(Character.isLetterOrDigit(c)) {
				st.push(Character.toString(c));
			}
			
		}
		
		return st.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String exp = "*-A/BC-/AKL";
		 System.out.println(postFixExp(exp));
	}

}
