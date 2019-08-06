import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {13,7,6,12};
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<a.length; i++)
		{
			while(!st.isEmpty() && a[i] > st.peek())
			{
				System.out.println(st.peek() +"---------->" + a[i]);
				st.pop();
			}
			st.push(a[i]);
		}
		while(!st.isEmpty())
		{
			System.out.println(st.peek() +"---------->" + "-1");
			st.pop();
		}
		
		 

	}

}
