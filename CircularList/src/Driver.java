
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularList clist = new CircularList();
		clist.isEmpty();
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		clist.insertAtFirst(1);
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		System.out.println("------------");
		clist.insertAtFirst(2);
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		clist.insertAtFirst(3);
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		clist.insertAtFirst(4);
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		clist.insertAtLast(5);
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		clist.insertAtPosAfter(2,6);
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		clist.insertAtPosAfter(1,6);
		System.out.println("Size of the list "+clist.Size());
		clist.viewList();
		
	}

}
