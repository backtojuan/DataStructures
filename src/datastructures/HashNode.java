package datastructures;

public class HashNode<K,V> {
	
	private K key;
	private V value;

	public HashNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public V getValue() {
		return value;
	}
	
	public K getKey() {
		return key;
	}
}
