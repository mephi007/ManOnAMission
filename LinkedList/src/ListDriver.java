import java.util.Scanner;

public class ListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			List list = new List();
			
			list.insertAtFirst(10);
			list.insertAtLast(30);
			list.insertAtPos(20, 2);
			list.insertAtPos(40, 2);
			list.viewList();
			System.out.println("size of list " + list.Size());
			System.out.println("----------------");
			list.deleteAtFirst();
			list.deleteAtEnd();
			list.deleteAtPos(2);
			//list.insertAtLast(30);
			list.viewList();
			System.out.println("size of list " + list.Size());
			System.out.println("---------------");
//			list.deleteList();
//			list.viewList();

	}

}
