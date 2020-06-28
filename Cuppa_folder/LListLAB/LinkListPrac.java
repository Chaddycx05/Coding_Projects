import java.util.*; 

public class LinkListPrac {
	public static void main(String args[]){
		String[] things = {"JJ ", "Christian ", "Richey ", "Mike " , "Jeff ", "Jahan "};
		String[] things2 = {"sausage ","bacon ","carnitas ","pollo "};
		LinkedList<String> list1, list2;
		list1 = loader(things);
		list2 = loader(things2);
		
		printMe(list1); // print the initial list
			
		//Add this entire list2 in to list1
		list1.addAll(list2); //addAll is a built-in method in LinkedList!
		list2 = null;//This is just responsible! a dereference
	
		printMe(list1); // print the list after combining list with list2
		removeStuff(list1, 1, 4); // remove a range of items from list1
		printMe(list1); // print list1 after removal from above
		reverseMe(list1); // reverse the list of items

	}


	/** This is a method design to load in an array of string and
	 * 	load them into a linked list. I can improve on this later by 
	 * 	using generics. Must revisit later.
	 */
	private static LinkedList<String> loader(String[] arr){
		LinkedList<String> list = new LinkedList<String>();
		for(String x: arr){
			list.add(x);
		}
		return list;
	}

	// print me method
	private static void printMe(List<String> list){
		for(String b: list)
			System.out.printf("%s", b);
		
		System.out.println();
	}
	
	//removeStuff
	private static void removeStuff(List<String> list, int from, int to){
		list.subList(from, to).clear();
		System.out.println();
	}

	//reverseMe
	private static void reverseMe(List<String> list){
		ListIterator<String> peterator = list.listIterator(list.size());
		while(peterator.hasPrevious()){
			System.out.printf("%s",peterator.previous());
		}
		System.out.println();
	}

}	
