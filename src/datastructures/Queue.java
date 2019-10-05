package datastructures;

public class Queue<Value> implements QueueInterface<Value> {
	
	private QueueNode<Value> front;
	private QueueNode<Value> back;
	
	public Queue() {
		front = null;
		back = null;
	}
	
	@Override
	public boolean isEmpty() {
		return back==null;
	}

	@Override
	public void offer(Value value) {
		QueueNode<Value> node = new QueueNode<Value>(value);
		
		if (isEmpty()) { 			
			front = node;		
		}						
		else {
			back.setNext(node);   
			} 		
		back = node;
	}
	
	@Override
	public Value poll() {
		Value value = null;
		if (!isEmpty( )) {
			QueueNode<Value> frontnode = front;
			
			if (front == back) {
				back = null;
			}
			else{
				front = front.getNext();
			}
			value = frontnode.getValue();
		}
		
		return value;
	}
	
	@Override
	public Value peek() {
		Value value = null;
		if(!isEmpty()) {
			value = front.getValue();
		}
		return value;
	}
}
