package dsaWeek3;

public class Main {
	
	  public static void main(String args[]) {
		
		  
		  /*
		DSAStack stack = new DSAStack();
		stack.push(1);
		System.out.println( stack.getCount() );
		stack.push(2);
		stack.push(3);
		System.out.println( stack.top() );
		stack.pop();
		System.out.println( stack.top() );
		stack.pop();
		System.out.println( stack.top() );
		stack.pop();
		System.out.println( stack.top() );
		*/
		  
		  /*
		  DSAQueue q1 = new DSAQueue();
		  q1.enqueue(1);
		  q1.enqueue(2);
		  q1.enqueue(3);
		  System.out.println( q1.peek() );
		  q1.dequeue();
		  System.out.println( q1.peek() );
		  q1.dequeue();
		  System.out.println( q1.peek() );
		  q1.dequeue();
		  */
		  
		  
		  CircularQueue q1 = new CircularQueue(5);
		  q1.enqueue(1);
		  q1.enqueue(2);
		  q1.dequeue();
		  q1.enqueue(3);
		  q1.enqueue(4);
		  q1.dequeue();
		  q1.enqueue(5);
		  q1.enqueue(6);
		  q1.enqueue(7);
		  
		  q1.display();
	}
	
	
	
}
