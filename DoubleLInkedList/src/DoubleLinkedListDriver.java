
public class DoubleLinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList dlist = new DoubleLinkedList();
		
		dlist.isEmpty();
		System.out.println(dlist.Size());
		System.out.println("-------------inserting at front-----------");
		dlist.insertAtFirst(1);
		dlist.viewList();
		System.out.println("--------inserting at last---------------");
		dlist.insertAtLast(2);
		dlist.viewList();
		

	}

}
