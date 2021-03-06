import java.util.*;

public class LinkedListPractice {

	public static void main(String[] args) {

		LinkedList<String> inventory = new LinkedList<>();
		
		// Add to LinkedList
		inventory.add("Wooden Shield");
		inventory.add("Leather Boots");
		inventory.addFirst("Leather Cap");
		inventory.addLast("Aluminum Gauntlet");
		inventory.add("Oak Staff");
		inventory.add("Bag of Dirt");
		inventory.add("Rabbit Paw");
		inventory.add("Fine Sand");
		
		// display the LinkedList
		printList(inventory);
		
		// remove an item from the LinkedList, then remove the last item from LinkedList
		remove(inventory, "Bag of Dirt");
		removeLast(inventory);
		
		// display the LinkedList
		printList(inventory);
		
		// display number of elements in LinkedList
		size(inventory);
		System.out.println(inventory.size());
		
		
		LinkedList<Integer> numberList = new LinkedList<>();
		numberList.add(3);
		numberList.add(6);
		numberList.add(7);
		numberList.add(2);
		numberList.add(10);
		numberList.add(21);
		
		System.out.println("\nnumberList: ");
		Iterator itr = numberList.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + ", ");
		}
		
		
		
		
		// END OF MAIN
	}
	
	// Print everything in LinkedList
	public static void printList(List list){
		System.out.println("\nInventory: ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("\t" + itr.next());
		}
	}
	
	// OVERLOAD remove()
	// Remove item from LinkedList
	public static void remove(LinkedList list, String item){
		System.out.println("\nYou threw away the " + item + ".");
		list.remove(item);
	}
	
	
	// OVERLOAD removeLast()
	// Remove last item from LinkedList
	public static void removeLast(LinkedList list){
		System.out.println("\nRemoving last item from inventory: " + list.removeLast());
	}
	
	
	// OVERLOAD size()
	// Displays number of items in LinkedList
	public static int size(LinkedList list){
		System.out.println("\nYou have " + list.size() + " items in your inventory.");
		return list.size();
	}

}
