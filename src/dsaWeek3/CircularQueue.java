package dsaWeek3;

public class CircularQueue extends DSAQueue {

		//fields and constants
	
	int head, end;
	
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


















