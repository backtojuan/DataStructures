package datastructures;

public interface QueueInterface<V> {
	
	public boolean isEmpty();
	
	public void offer(V value);
	
	public V poll();

	public V peek();
}
