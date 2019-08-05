import java.util.Stack;

public class InfixtoPost {
	static int prec(char c)
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
	
	static String infixToPost(String exp)
	{
		String result = "";
		Stack<Character> st = new Stack<>();
		
		for(int i=0; i<exp.length(); i++)
		{
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c))
				result += c;
			else if(c == '(')
				st.push(c);
			else if(c == ')')
			{
				while(!st.isEmpty() && st.peek() != '(')
				{
					result +=st.pop();
				}
				if(!st.isEmpty() && st.peek() != '(')
					return "Invalid exp";
				else st.pop();
			}
			else {
				while(!st.isEmpty() && prec(c) <= prec(st.peek())) {
					if(st.peek() == '(')
						return "invalid exp";
					
					result += st.pop();					
				}
				st.push(c);
				}
		}
		
		while(!st.isEmpty()) {
			if(st.peek() == '(')
				return "invalid exp";
			
			result += st.pop();
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        String exp = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(infixToPost(exp)); 

	}

}
