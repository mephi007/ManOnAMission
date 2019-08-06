import java.util.Stack;

public class InToPre {
	
	static int isOperator(char c)
	{
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
	return -1;
	}
	
	static String InToPre(String exp)
	{
		Stack<Character> st = new Stack<>();
		String result = "";
		for(int i=exp.length()-1; i>=0; i--)
		{
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				result += c;
			}
			else if(c == ')')
				st.push(c);
			else if(c == '(')
			{
				while(!st.isEmpty() && st.peek() != ')')
				{
					result += st.peek();
					st.pop();
				}
			}
			else {
				while(!st.isEmpty() && isOperator(c) <= isOperator(st.peek()))
				{
					result += st.peek();
					st.pop();
				}
				st.push(c);
			}
			
			while(!st.isEmpty()) {
				result += st.peek();
				st.pop();
			}
	}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exps = ("(a-b/c)*(a/k-l)");
		System.out.println(InToPre(exps));

	}

}
