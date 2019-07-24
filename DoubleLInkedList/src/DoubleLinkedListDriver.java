
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
		dlist.insertAtLast(3);
		dlist.viewList();
		System.out.println("-----inserting after 2nd postion");
		dlist.insertAtposAfter(4, 2);
		dlist.viewList();
		System.out.println("-----inserting before 2nd postion");
		dlist.insertAtposBefore(5, 2);
		dlist.viewList();
		System.out.println("------deleting at first-------------");
		dlist.deleteAtFirst();
		dlist.viewList();
		System.out.println("------deleting at last--------------");
		dlist.deleteAtLast();
		dlist.viewList();
		System.out.println("---------------deleting at pos------------");
		dlist.deleteAtPos(2);
		dlist.viewList();
		System.out.println("--------------------------------------");
		dlist.insertAtFirst(1);
		dlist.insertAtFirst(2);
		System.out.println("------------reversing the list------------------");
		dlist.reverse();
		dlist.viewList();
		dlist.deleteList();
		System.out.println("------------------------------------------");
		dlist.insertAtFirst(9);
		dlist.insertAtFirst(8);
		dlist.insertAtFirst(6);
		dlist.insertAtFirst(5);
		dlist.insertAtFirst(4);
		dlist.insertAtFirst(2);
		dlist.insertAtFirst(1);
		dlist.viewList();
		dlist.sumPair(7);
		System.out.println("---------------------------------------");
		dlist.viewList();
		System.out.println("---------------inserting 7 -----------------");
		dlist.insertSort(7);
		dlist.viewList();
		System.out.println("-----------------------------------");
		System.out.println("-------------swapping first and last------------");
		dlist.swapKthNode(1);
		dlist.viewList();
		System.out.println("------------------------------------");
		dlist.deleteList();
		dlist.insertAtFirst(4);;
		dlist.insertAtposAfter(4, 1);
		dlist.insertAtposAfter(4, 2);
		dlist.insertAtposAfter(4, 3);
		dlist.insertAtposAfter(4, 4);
		dlist.insertAtposAfter(6, 5);
		dlist.insertAtposAfter(8, 6);
		dlist.insertAtposAfter(8, 7);
		dlist.insertAtposAfter(10, 8);
		dlist.insertAtposAfter(12, 9);
		dlist.insertAtposAfter(12, 10);
		dlist.viewList();
		System.out.println("------removing delete---------------");
		dlist.removeDuplicate();
		dlist.viewList();
		
		
		

	}

}
