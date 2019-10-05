package datastructures;

public interface HashInterface<K,V> {
	
	public V getValue(K key);
	
	public void add(K key, V value);
	 
	public boolean containsKey(K key);
	
	public int size();
}
