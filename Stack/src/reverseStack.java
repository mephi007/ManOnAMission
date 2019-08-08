import java.util.Stack;

public class reverseStack {
	
	public static Stack<Integer> rev(Stack<Integer> st)
	{
		if(st.isEmpty())
			return st;
		
		int temp = st.pop();
		rev(st);
		insertAtBottom(st, temp);
		return st;
	}
	
	private static void insertAtBottom(Stack<Integer> st, int x)
	{
		if(st.isEmpty())
		{
			st.push(x);
			return;
		}
		
		int temp = st.pop();
		insertAtBottom(st, x);
		st.push(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(3);
		s.push(2);
		s.push(1);
		
		System.out.println("before reversing::"+s.peek());
		System.out.println("-----------------------");
		
		rev(s);
		
		System.out.println("after reversing::"+s.peek());

	}

}
