package datastructures;

public interface StackInterface<Value> {
	
	public boolean isEmpty();
	
	public void push(Value value);
	
	public Value peek();
	
	public Value pop();
}
