import java.util.Stack;

public class postToIn {
	
	static boolean isOperator(char c)
	{
		switch(c) {
		case '+':
		case '-':
		case '*':
		case '/':
			return true;
		}
	return false;
	}
	
	static String postToInfix(String exp) {
		Stack<String> st = new Stack<>();
		for(int i=0; i< exp.length(); i++)
		{
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				st.push(Character.toString(c));
			}
			else if(isOperator(c)) {
				String op1 = st.peek();
				st.pop();
				String op2 = st.peek();
				st.pop();
				
				String temp = "(" +op2 + Character.toString(c) + op1 +")";
				st.push(temp);
			}
		}
		
		return st.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = " AB+CD-*"; 
		System.out.println(postToInfix(exp));
	}

}
