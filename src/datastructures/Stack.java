package datastructures;

public class Stack<Value> implements StackInterface<Value> {

	private StackNode<Value> top;
	
	public Stack() {
		top = null;
	}
	
	@Override
	public boolean isEmpty() {
		return top.equals(null);
	}

	@Override
	public void push(Value value) {
		top = new StackNode<Value>(value,top);
	}

	@Override
	public Value peek() {
		Value value = null;
		if(top!=null) {
			value = top.getValue();
		}
		return value;
	}

	@Override
	public Value pop() {
		Value value = null;
		if(top!=null) {
			value = top.getValue();
			top = top.getNext();
		}
		return null;
	}
}
