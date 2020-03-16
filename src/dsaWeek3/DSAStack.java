package dsaWeek3;

public class DSAStack {
	
	//class fields and constants
	Object stack[];
	int count;
	public final int DEFAULT_CAPACITY = 100;
	
	//default constructor
	DSAStack() {
		stack = new Object[DEFAULT_CAPACITY];
		count = 0;
	}
	
	//Alternate constructor
	DSAStack( int max_capacity) {
		stack = new Object[max_capacity];
		count = 0;
	}
	
	//accessors
	int getCount() {
		int i;
		for(i = 0; stack[i] == null; i++);
		
		return i;
	}
	
	boolean isEmpty() {
		boolean empty = false;
		if (this.count == 0) {
			empty = true;
		}
		return empty;
	}
	
	boolean isFull() {
		boolean full = false;
		if (this.count == stack.length) {
			full = true;
		}
		return full;
	}
	
	Object top() {
		Object topVal;
		if (isEmpty()==true) {
			topVal=0;
			//ADD EXCEPTION
		}
		else {
			topVal = stack[count -1];
		}
		return topVal;
	}
	
	//mutators
	void push(Object value) {
		if(isFull() == true) {
			//ADD EXCEPTION
		}
		else {
			stack[count] = value;
			count ++;
		}
	}
	
	Object pop() {
		Object topVal = top();
		count--;
		return topVal;
	}
	
}

















