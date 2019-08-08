import java.util.Stack;

public class deleteMiddleStack {
	
	static void deleteMid(Stack<Integer> st, int n, int curr)
	{
		if(st.isEmpty() || curr == n)
		{
			return;
		}
		int x = st.pop();
		deleteMid(st,n, curr+1);
		if(curr != n/2)
		{
			st.push(x);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);
		st.push(1);
		
		deleteMid(st, st.size(), 0);
		
		while(!st.isEmpty())
		{
			System.out.println(st.peek());
			st.pop();
		}
		
		

	}

}
