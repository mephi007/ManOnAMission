import java.util.Stack;

public class PrefixToInfix {
	
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
	
	static String preToin(String exp) {
		String res =new String("");
		Stack<String> st = new Stack<>();
		for(int i = exp.length()-1; i>= 0; i--)
		{
			char c = exp.charAt(i);
			
			if(Character.isLetterOrDigit(c))
				st.push(Character.toString(c));
			else if(isOperator(c)) {
				String op1 = st.peek();
				st.pop();
				String op2 = st.peek();
				st.pop();
				res = "("+ op1 + Character.toString(c)+ op2+ ")";
				st.push(res);
				}
			
		}
		return st.peek();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "*-A/BC-/AKL"; 
		  System.out.println(preToin(exp)); 

	}

}
