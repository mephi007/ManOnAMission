import java.util.Stack;

public class NextGreaterFreqElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 1, 2, 3, 4, 2, 1};
		int max =  a[0];
		for(int i=1; i<a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		int[] freq = new int[max+1];
		for(int i:a)
			freq[a[i]]++;
		
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<a.length; i++)
		{
			while(!st.isEmpty() && freq[a[i]] > freq[st.peek()])
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
