package datastructures;

import java.util.ArrayList;
import java.util.List;

public class HashTable<K,V> implements HashInterface<K,V> {
	
	private List<HashNode<K,V>> nodes;
	
	private int tablesize; 
	private int numNodes;
	
	public HashTable() {
		tablesize = 10;
		nodes = new ArrayList<>();
		
		for (int i = 0; i < tablesize; i++) {
			nodes.add(null);
		}
	}

	@Override
	public V getValue(K key) {
		
		V value = null;
		boolean found = false;
		
		for(int counter = 0; counter<tablesize;counter++) {
			
			int index = getIndex(key, counter);
		
			if(nodes.get(index)!= null && nodes.get(index).getKey().equals(key)) {
				found = true;
				value = nodes.get(index).getValue();
			}
		}
			return value;
	}

	@Override
	public void add(K key, V value) {
		
		boolean found = false;
	
		for(int counter=0; !found && counter<tablesize;counter++) {
			int index = getIndex(key, counter);
			
			if(nodes.get(index)==null) {
				found = true;
				nodes.remove(index);
				nodes.add(index, new HashNode<K, V>(key, value));
				numNodes++;
			}
						
			if(counter==tablesize && !found) {
				tablesize*=2;
				
				for (int i = counter; i < tablesize; i++) {
					nodes.add(null);
				}
			}
		}
		
	}

	@Override
	public boolean containsKey(K key) {
		int index = getIndex(key, 0);
		boolean contains = false;	
			if(nodes.get(index)!=null) {
				contains = true;
			}
				
		return contains;
	}

	@Override
	public int size() {
		return numNodes;
	}
	
	private int getIndex(K key, int counter) {
		int index = 0;
		
		int hashCode = Math.abs(key.hashCode());
		
		double A = (Math.sqrt(5) - 1 )/ 2;
		int h1 = (int) Math.floor(tablesize*(A*hashCode% 1));
		
		int h2 = hashCode % tablesize;
		
		index = (h1 + h2*counter)%tablesize;
		return index;
	}
}
