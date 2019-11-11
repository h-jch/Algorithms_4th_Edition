package chapter_4.ch4_4;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.Topological;

public class AcyclicSP {
    private DirectedEdge[] edgeTo;
    private double[] distTo;

    public AcyclicSP(EdgeWeightedDigraph G, int s){
        edgeTo=new DirectedEdge[G.V()];
        distTo=new double[G.V()];

        for(int v=0;v<G.V();v++)
            distTo[v]=Double.POSITIVE_INFINITY;
        distTo[s]=0.0;

        Topological top=new Topological(G);
        for(int v:top.order())
            relax(G, v);
    }

    private void relax(EdgeWeightedDigraph G, int v){
        for(DirectedEdge e:G.adj(v)){
            int w=e.to();
            if(distTo[w]>distTo[v]+e.weight()){
                distTo[w]=distTo[v]+e.weight();
                edgeTo[w]=e;
            }
        }
    }

    public boolean hasPathTo(int v){
        return distTo[v]<Double.POSITIVE_INFINITY;
    }

    public Iterable<DirectedEdge> pathTo(int v){
        if(!hasPathTo(v))
            return null;
        Stack<DirectedEdge> path=new Stack<>();
        for(DirectedEdge e=edgeTo[v];e!=null;e=edgeTo[e.from()])
            path.push(e);
        return path;
    }
}
