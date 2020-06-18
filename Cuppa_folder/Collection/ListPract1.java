/**
 *	-Create a list that will
 *	-Use an enhanced forloop to print out items in
 *	in the list.
 *	-Create a second list
 *	-Use an enhanced forloop to see what is in that as well 
 *
 * */

import java.util.*;

class ListPrac1 {



	public static void main(String[] args){
		String[] things = {"eggs", "bacon", "juice", "lasers", "candy corn"};
		String[] moreThings = {"lasers", "candy corn"};
		List<String> first_list = new ArrayList<String>();
		List<String> second_list = new ArrayList<String>();

		for(String x: things){
			first_list.add(x);
		}

		for(String x: first_list){
			System.out.println(x);
		}
	

	
		for(String y: moreThings){
			second_list.add(y);
		}

		edit_the_list(first_list, second_list);
		 
		System.out.println();

		for(String x: first_list){
			System.out.println(x);
		}




	}




	
	public static void edit_the_list(Collection<String> l1, Collection<String> l2){
		Iterator<String> iter = l1.iterator();
		while(iter.hasNext()){
			if(l2.contains(iter.next())){
				iter.remove();
			}
		}
	}	


}
