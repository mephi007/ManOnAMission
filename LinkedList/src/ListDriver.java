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
			list.insertAtLast(30);
			list.insertAtPos(55, 2);
			list.insertAtFirst(5);
			list.viewList();
			System.out.println("given value found " +list.Search(20));
			System.out.println("----------------");
			list.viewList();
			System.out.println("Data at position 2 "+":"+list.getNth(2));
			System.out.println("Data at position 3 from the last is "+":"+list.getNthfromLast(3));
			list.insertAtPos(35, 2);
			System.out.println("-----------------------");
			list.viewList();
			System.out.println("the middle data is "+list.getMiddleNode().getData());
			System.out.println("-----------------");
			list.insertAtLast(40);
			list.insertAtPos(40, 4);
			list.insertAtPos(40, 2);
			list.viewList();
			System.out.println("--------------------");
			System.out.println("40 has occured for :"+list.countOccur(40));
			System.out.println("---------------------------");
			System.out.println("detecting loop before there is even a loop");
			System.out.println("Does the linked list have loop "+ list.detectLoop());
			System.out.println("Does the linked list have loop using Floyd's Cycle-Finding Algo "+ list.detectLoop());
			list.createLoop(5);
			System.out.println("Does the linked list have loop "+ list.detectLoop());
			System.out.println("Does the linked list have loop using Floyd's Cycle-Finding Algo "+ list.FlCycFinding());
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("count of element in the loop");
			System.out.println(list.detectandcountLoop());
			System.out.println("---------------------------------------------------------------");
			list.deleteList();
			list.insertAtFirst(11);
			list.insertAtPos(11, 2);
			list.insertAtPos(11, 3);
			list.insertAtPos(21, 4);
			list.insertAtPos(43, 5);
			list.insertAtPos(43, 6);
			list.insertAtLast(60);
			list.viewList();
			System.out.println("---------------deleting the duplicates-----------------");
			list.deleteduplicatesSorted();
			list.viewList();
			System.out.println("-----------------------------------------");
			list.deleteList();
			list.insertAtFirst(12);
			list.insertAtPos(11, 2);
			list.insertAtPos(12, 3);
			list.insertAtPos(21, 4);
			list.insertAtPos(41, 5);
			list.insertAtPos(43, 6);
			list.insertAtLast(21);
			list.insertAtLast(21);
			list.insertAtPos(12, 3);
			list.viewList();
			list.deleteduplicatesUnSorted();
			System.out.println("----------------------------------");
			list.viewList();
			System.out.println("-----------------------------------------------");
			list.deleteList();
			list.insertAtFirst(10);
			list.insertAtPos(15, 2);
			list.insertAtPos(12, 3);
			list.insertAtPos(13, 4);
			list.insertAtPos(20, 5);
			list.insertAtLast(14);
			list.viewList();
			list.SwapNode(12, 20);
			System.out.println("Swap");
			list.viewList();
			
			
			
			

	}

}
