public class Main {

    public static void main(String[] args) {
                MatrixGraph thisGraph = new MatrixGraph(7);
                thisGraph.addEdge(0, 1, 1);
                thisGraph.addEdge(0, 2, 5);
                thisGraph.addEdge(0, 4, 3);
                thisGraph.addEdge(1, 4, 1);
                thisGraph.addEdge(1, 5, 7);
                thisGraph.addEdge(2, 3, 1);
                thisGraph.addEdge(3, 4, 1);
                thisGraph.addEdge(3, 6, 1);
                thisGraph.addEdge(4, 2, 1);
                thisGraph.addEdge(4, 3, 3);
                thisGraph.addEdge(4, 5, 3);
                thisGraph.addEdge(4, 6, 4);
                thisGraph.addEdge(5, 6, 1);
                thisGraph.printGraph();
                thisGraph.MSTPrims();

        System.out.println("________________________");


        AdjacencyList adjgraph = new AdjacencyList();
        System.out.println("Printing adjacency list graph");
        Vertex A = new Vertex("0");
        adjgraph.addVertex(A);
        Vertex B = new Vertex("1");
        adjgraph.addVertex(B);
        Vertex C = new Vertex("2");
        adjgraph.addVertex(C);
        Vertex D = new Vertex("3");
        adjgraph.addVertex(D);
        Vertex E = new Vertex("4");
        adjgraph.addVertex(E);
        Vertex F = new Vertex("5");
        adjgraph.addVertex(F);
        Vertex G = new Vertex("6");
        adjgraph.addVertex(G);

        adjgraph.addEdge(A,B,1);
        adjgraph.addEdge(A,C,3);
        adjgraph.addEdge(B,E,1);
        adjgraph.addEdge(B,F,7);
        adjgraph.addEdge(C,D,1);
        adjgraph.addEdge(D,E,1);
        adjgraph.addEdge(D,G,1);
        adjgraph.addEdge(E,C,1);
        adjgraph.addEdge(E,D,3);
        adjgraph.addEdge(E,F,3);
        adjgraph.addEdge(E,G,4);
        adjgraph.addEdge(F,G,1);


        adjgraph.printGraph();

    }
}

