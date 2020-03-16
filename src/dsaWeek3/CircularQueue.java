package dsaWeek3;

public class CircularQueue {

		//fields and constants
	Object queue[];
	int head, end;
	public static final int DEFAULT_CAPACITY = 100;
	
	CircularQueue() {
		queue = new Object[DEFAULT_CAPACITY];
		head = 0;
		end = 0;
	}
	
	CircularQueue(int max_capacity) {
		queue = new Object[max_capacity];
		head = 0;
		end = 0;
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
	
	Object peek() {
		Object first;
		if (isEmpty() == true) {
			//ADD EXCEPTION
			first = 0;
		}
		else {
			first = queue[head];
		}
		return first;
	}
	
	void display() {
		for (int i = 0; i < queue.length ; i ++) 
			System.out.println(queue[i]);
	}
	
	//mutators
	void enqueue(Object value) {
		if ( isFull() == true) {
			//throw exception
		}
		else {
			queue[end] = value;
			if (end == queue.length-1)
				end = 0;
			else
				end++;
		}
	}
	
	Object dequeue() {
		Object first = queue[head];
		if ( isEmpty() ==true) {
			//add exception
		}
		else {
			queue[head] = null;
			if ( head == queue.length-1)
				head = 0;
			else
				head ++;
		}
		return first;
	}
}


















