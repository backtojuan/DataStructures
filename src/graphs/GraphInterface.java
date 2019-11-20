package graphs;

import java.util.ArrayList;
import java.util.List;
/**
 * This interface is implemented by the different representations of a Graph
 * It includes the basic operations and helpful methods seen in class
 * @author Maria Camila Lenis, Juan Sebastian Palma, Javier Andrés Torres
 * @param <T> The type of data that will be store in the vertex
 */
public interface GraphInterface<T> {
	/**
	 * For many methods we need to use an infinity value
	 */
	public static final int INF = 12345678;
	/**
	 * Getter of the list of vertices the graph has
	 * @return The list of vertices in the graph
	 */
	public List<Vertex<T>> getVertices();
	/**
	 * Getter of the state of the graph, if it is directed or not
	 * @return true if it is directed or false if it is not directed
	 */
	public boolean isDirected();
	/**
	 * Getter of the state of the graph, if it is weighted or not
	 * @return true if it is weighted or false if it is not weighted
	 */
	public boolean isWeighted();
	/**
	 * This method adds a new vertex in the graph
	 * It just add it it do not add a connection to an edge
	 * @param value The vertex that will be added. value!=null
	 */
	public void addVertex(T value);
	/**
	 * This method adds a simple edge between two existing vertices
	 * @param x The from vertex of the edge. x!=null
	 * @param y The to vertex of the edge. y!=null
	 */
	public void addEdge(T x, T y);
	/**
	 * This method adds a weighted edge between two existing vertices
	 * @param x The from vertex of the edge. x!=null
	 * @param y The to vertex of the edge. y!=null
	 * @param w The weight of the vertex. w!=null
	 */
	public void addEdge(T x, T y, double w);
	/**
	 * This methods removes a vertex from the list and all the edges that are incidents on it
	 * @param v The vertex that will be remove. v!=null
	 */
	public void removeVertex(T v);
	/**
	 * This methods remove an edge from x to y
	 * @param x The from vertex of the edge. x!=null
	 * @param y The to vertex of the edge. y!=null
	 */
	public void removeEdge(T x, T y);
	/**
	 * This method returns the adjacent vertices from x
	 * @param x The vertex. x!=null
	 * @return A list of the adjacent vertices 
	 */
	public List<Vertex<T>> getNeighbors(Vertex<T> x);
	/**
	 * Getter of the number of vertices in the graph
	 * @return The number of vertices in the graph
	 */
	public int getNumberOfVertices();
	/**
	 * Getter of the number of edges in the graph 
	 * @return The number of edges in the graph
	 */
	public int getNumberOfEdges();
	/**
	 * This method verifies if two vertex are adjacent
	 * @param x The from vertex. x!=null
	 * @param y The to vertex. y!=null
	 * @return true if they are adjacent or false if they are not
	 */
	public boolean areAdjacent(Vertex<T> x, Vertex<T> y);
	/**
	 * This method verifies if a value is in the graph
	 * @param value The value that will be searched for. value!=null
	 * @return true if it is in the graph or false if it is not
	 */
	public boolean isInGraph(T value);
	/**
	 * This method returns the weight of and edge between x and y
	 * @param x The from vertex of the edge. x!=null
	 * @param y The to vertex of the edge. y!=null
	 * @return the weight of the edge
	 */
	public double getEdgeWeight(Vertex<T> x, Vertex<T> y);
	/**
	 * This method modifies the weight of and edge between x and y  
	 * @param x The from vertex of the edge. x!=null
	 * @param y The to vertex of the edge. y!=null
	 * @param w The new weight for the edge. w!=null
	 */
	public void setEdgeWeight(Vertex<T> x, Vertex<T> y, double w);
	/**
	 * This methods implements the bfs path from a vertex s.
	 * @param s The vertex where the path will starts. s!=null
	 */
	public void bfs(Vertex<T> s);
	/**
	 * This method implements the dfs path.
	 */
	public void dfs();
	/**
	 * This method implements the Dijkstra shortest path method from Vertex x to the rest.
	 * @param x The vertex where the path begins. x!=null.
	 */
	public void dijkstra(Vertex<T> x);
	/**
	 * This method implements the Floyd-Warshall Shortest Path of all node to all nodes.
	 * @return the matrix of shortest paths for each vertex.
	 */
	public double[][] floydwarshall();
	/**
	 * This method implements the Prim methods for the shortest weight tree.
	 * @param s The vertex where the path begins. s!=null.
	 */
	public void prim(Vertex<T> s);
	/**
	 * This method finds one path the connects all vertices with the least weight path.
	 * @return Returns an ArrayList containing the edges needed to complete the shortest weight path.
	 */
	public ArrayList<Edge<T>> kruskal();
	/**
	 * This method searches a vertex based on the value it receives.
	 * @param value Is the T value that the method receives. value!=null.
	 * @return Returns a Vertex>T> that contains the value T.
	 */
	public Vertex<T> searchVertex(T value);
	/**
	 * This method collects all of the edges present on the graph.
	 * @return Returns a list with the Edges.
	 */
	public List<Edge<T>> getEdges();
	/**
	 * This method collects all of the T values in the graph
	 * @return This method returns a List with all the T values present in the graph.
	 */
	public List<T> getContents();
}
