package studio3;

public class OrderedArray<T extends Comparable<T>> implements PriorityQueue<T> {

	public T[] array;
	private int size;
	
	@SuppressWarnings("unchecked")
	public OrderedArray(int maxSize) {
		array = (T[]) new Comparable[maxSize];
		size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		if(this.array == null)
		{
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void insert(T thing) {
		array[size] = thing;
		T tmp;
		int j = size;
		while(j>0 && array[j].compareTo(array[j-1]<0){
			tmp = array[j];
			array[j-1] = tmp;
			j--;
		}
		size ++;
	}
	
	@Override
	public T extractMin() {
			T result = array[0];
			int i = 0 ;
			array[0] = null;
			while(i<size-1) {
				array[i] = array[i+1];
				i++;
			}
			array[size-1] = null;
			size--;
			return result;
		
	}

}
