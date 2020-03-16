package dsaWeek3;

public class ShufflingQueue {

		//fields and constants
	Object queue[];
	int count;
	public static final int DEFAULT_CAPACITY = 100;
	
	ShufflingQueue() {
		queue = new Object[DEFAULT_CAPACITY];
		count = 0;
	}
	
	ShufflingQueue(int max_capacity) {
		queue = new Object[max_capacity];
		count = 0;
	}
	
	
	//accessors
	int getCount() {
		int i;
		for( i=0; queue[i] == null ; i++ ) {
			
		}
		return i;
		
	}
	
	Boolean isEmpty() {
		boolean empty = false;
		if (count == 0) {
			empty = true;
		}
		return empty;
	}
	
	Boolean isFull() {
		boolean full = false;
		if (count == queue.length) {
			full = true;
		}
		return full;
		
	}
	
	Object peek() {
		Object first;
		if (isEmpty() == true) {
			//ADD EXCEPTION
			first = 0;
		}
		else {
			first = queue[0];
		}
		return first;
	}
	
	//mutators
	void enqueue(Object value) {
		//if ( isFull() != true) {
			queue[count] = value;
			count++;
		//}
		//else {
			//ADD EXCEPTION
			
		//}
	}
	
	Object dequeue() {
		Object first = queue[0];
		if ( isEmpty() !=true) {
			for(int i = 1; i < queue.length; i++ )
				queue[i-1] = queue[i];
			count --;
		}
		else {
			//ADD EXCEPTION
		}
		return first;
	}
}


















