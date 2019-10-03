package studio3;

import java.util.LinkedList;
import java.util.List;

public class UnorderedList<T extends Comparable<T>> implements PriorityQueue<T> {

	public LinkedList<T> list;
	
	public UnorderedList() {
		list = new LinkedList<T>();
	}
	
	@Override
	public boolean isEmpty() {
		
		if(list.size() ==0){
		return true;
		}
		else {
			return false;
			}
	
	}

	@Override
	public void insert(T thing) {
		list.add(thing);
	}

	@Override
	public T extractMin() {
	
		if (list.size() ==0) {
			return null;
		}
		T x = list.get(0);
		if (list.size() ==1  ){
		return x ;
		}

		for (int i=1; i<list.size(); i++) {
			if(list.get(i) > list.get(i-1)) {
				
		
			
		}
	}
	
	}
}

