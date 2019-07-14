
public class Node {
		private int data;
		private Node next;
		
		public Node()
		{
			this.data = 0;
			this.next = null;
		}
		
		public Node(int d, Node n)
		{
			this.data = d;
			this.next = n;
		}
		
		public void setData(int val)
		{
			this.data = val;
		}
		
		public void setNext(Node n)
		{
			this.next = n;
		}
		
		public int getData()
		{
			return data;
		}
		
		public Node getNext()
		{
			return next;
		}
}
