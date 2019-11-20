package graphs;

public class Vertex<T> implements Comparable<Vertex<T>>{

	public static final int WHITE = 0;
	public static final int GRAY = 1;
	public static final int BLACK = 2;
	
	private T value;

	/**
	 * Distance or Initial TimeSTamp for DFS
	 */
	private double i;
	/**
	 * Final TimeStamp for DFS
	 */
	private int f;
	
	private int index;
	
	private int color;
	
	private Vertex<T> pred;
	
	public Vertex(T value) {
		this.value=value;
		pred=null;
		color=WHITE;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public double getD() {
		return i;
	}

	public void setD(double d) {
		this.i = d;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public Vertex<T> getPred() {
		return pred;
	}

	public void setPred(Vertex<T> pred) {
		this.pred = pred;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public void setIndex(int index) {
		this.index=index;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public int compareTo(Vertex<T> vertex) {
		int comp = Double.compare(i, vertex.i);
		if(value instanceof Comparable) {
			if(comp == 0) {
				return ((Comparable) value).compareTo(vertex.getValue());
			}
		}
		return comp;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
}
