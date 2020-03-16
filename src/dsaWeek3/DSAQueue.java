package dsaWeek3;

public class DSAQueue {

		//fields and constants
	Object queue[];
	public static final int DEFAULT_CAPACITY = 100;
	
	DSAQueue() {
		queue = new Object[DEFAULT_CAPACITY];
	}
	
	DSAQueue(int max_capacity) {
		queue = new Object[max_capacity];
	}
	
	
	//accessors
	int getCount() {
		int filledArray=0;
		for(int i=0; i < queue.length ; i++ ) {
			if(queue[i] != null)
				filledArray = filledArray + 1;
		}
		return filledArray;
		
	}
	Boolean isEmpty() {
		boolean empty = false;
		if (getCount() == 0) {
			empty = true;
		}
		return empty;
	}
	
	Boolean isFull() {
		boolean full = false;
		if (getCount() == queue.length) {
			full = true;
		}
		return full;	
	}
	
	void display() {
		for (int i = 0; i < queue.length ; i ++) 
			System.out.println(queue[i]);
	}
	//peek() will be inherited by derived class
	/*
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
	*/
	
}


















