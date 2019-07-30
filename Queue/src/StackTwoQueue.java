import java.util.LinkedList;
import java.util.Queue;

public class StackTwoQueue {
	
	static class stack{
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();
		static int curr_size;
		
		public stack()
		{
			curr_size = 0;
		}
		
		static void push(int x)
		{
			curr_size++;
			q2.add(x);
			while(!q1.isEmpty())
			{
				q2.add(q1.peek());
				q1.remove();
			}
			
			//swap
			Queue<Integer> q = q1;
			q1 = q2;
			q2 = q;
		}
		
		static void pop()
		{
			if(q1.isEmpty())
				return;
			q1.remove();
			curr_size--;
		}
		
		static int top()
		{
			if(q1.isEmpty())
				return -1;
			return q1.peek();
		}
		
		static int size()
		{
			return curr_size;
		}
		

		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stack s = new stack();
		s.push(1);
		System.out.println(s.top());
		s.push(2);
		System.out.println(s.top());
		s.push(3);
		System.out.println(s.top());
		s.pop();
		System.out.println("-------------" + s.top());


		
		
		

	}

}
