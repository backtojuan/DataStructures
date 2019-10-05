package datastructures;

public class StackNode<Value> {
	
	private Value value;
	
	private StackNode<Value> next;
	
	public StackNode(Value value, StackNode<Value> next) {
		this.value = value;
		this.next = next;
	}

	public Value getValue() {
		return value;
	}

	public StackNode<Value> getNext() {
		return next;
	}

	public void setNext(StackNode<Value> next) {
		this.next = next;
	}
}
