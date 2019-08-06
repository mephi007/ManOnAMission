import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {100,80,60,70,60,75,85};
		int[] s = new int[7];
		Stack<Integer> st = new Stack<>();
		s[0] = 1;
		st.push(0);
		for(int i=1; i<a.length; i++)
		{
			while(!st.isEmpty()) {
				if(a[i] < a[st.peek()])
				{
					s[i] = i - st.peek();
					st.push(i);
					break;
				}
				else st.pop();
			}
		}
		
		for(int n:s) {
			System.out.println(n);
		}
		
		}

	}

