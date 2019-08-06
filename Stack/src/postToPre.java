import java.util.Stack;

public class postToPre {
	
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
	
	static String postTopre(String exp)
	{
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
				
				String temp = Character.toString(c)+ op2  + op1 ;
				st.push(temp);
			}
		}
		
		return st.peek();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String exp = "ABC/-AK/L-*"; 
	        System.out.println("Prefix : " + postTopre(exp)); 
		

	}

}
