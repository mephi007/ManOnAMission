import java.util.Stack;

public class sortStackUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(34);
		st.push(3);
		st.push(31);
		st.push(98);
		st.push(92);
		st.push(23);
		
		System.out.println("unsorted stack::"+st.peek());
		Stack<Integer> temp = new Stack<Integer>();
		
		while(!st.isEmpty())
		{
			if( !temp.isEmpty() && st.peek()<temp.peek())
			{
				int t = st.pop();
				while(!temp.isEmpty() && t < temp.peek())
				{
					st.push(temp.peek());
					temp.pop();
				}
				temp.push(t);
			}
			else {
				temp.push(st.peek());
				st.pop();
			}
		}
		
		System.out.println("-----------------------------");
		System.out.println("sorted stack::"+temp.peek());

	}

}
