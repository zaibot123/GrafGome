import java.util.ArrayList;

public class AdjacencyList {
    int StartVertex=0;

    private ArrayList<Vertex> vertices;

    public AdjacencyList() {
        vertices = new ArrayList<Vertex>(); //constructor

    }

    public void addVertex(Vertex v) {
        vertices.add(v);

    }
    public void addEdge(Vertex from, Vertex to, Integer dist){
        if (!(vertices.contains(from) && vertices.contains(to))){
            System.out.println("Vertex not found");
            return;
        }
        Edge newEdge = new Edge(from,to,dist);

    }

    public MSTPrims(AdjacencyList,vertices,StartVertex){

        int[] Distance =new int[vertices];
        int[] predecessor = new int[vertices];
        boolean[] visited =  new boolean[];
        for (int i = 0; i<vertices.size();i++){
            visited[i]=false;
        }
    }

    public void printGraph(){
        Vertex currentv;
        for (int i = 0; i < vertices.size(); i++) {
            currentv=vertices.get(i);
            System.out.println("Edges from Vertex " + currentv.getName());
            for (int j = 0; j < currentv.getOutEdges().size(); j++)
            {
                Edge currente=currentv.getOutEdges().get(j);
                System.out.println("To " + currente.getToVertex().getName()+ "  weight " +currente.getWeight());
            }
            System.out.println(" ");

        }
    }
}

class Vertex implements Comparable<Vertex> {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    private String Name;
    private ArrayList<Edge> outEdges;
    Integer distance = Integer.MAX_VALUE;
    Vertex prev = null;
    public Vertex(String ID) {
        this.Name = ID;               //constructor
        outEdges = new ArrayList<>();
    }

    public int compareTo(Vertex o) {
        if (this.distance < o.distance)
            return -1;
        if (this.distance > o.distance)
            return 1;
        return 0;
    }

    public void addOutEdge(Edge outEdge) {
        outEdges.add(outEdge);
    }

}

class Edge {
    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;

    public Edge(Vertex from, Vertex to, Integer Cost) {
        fromVertex = from;
        toVertex = to;
        weight = Cost;
        from.addOutEdge(this);

    }

}
