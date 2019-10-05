package datastructures;

public class QueueNode<Value> {
	
	private Value value;
	
	private QueueNode<Value> next;
	
	public QueueNode(Value value) {
		this.value = value;
	}

	public Value getValue() {
		return value;
	}

	public QueueNode<Value> getNext() {
		return next;
	}

	public void setNext(QueueNode<Value> next) {
		this.next = next;
	}	
}
