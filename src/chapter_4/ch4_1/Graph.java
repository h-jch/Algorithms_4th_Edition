package chapter_4.ch4_1;

import chapter_1.ch1_3.Bag;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Graph
 */
public class Graph {
    private final int V;
    private int E;
    private Bag<Integer>[] adj;
    
    public Graph(int V){
        this.V=V;
        this.E=0;
        adj=(Bag<Integer>[])new Bag[V];
        for(int v=0;v<V;v++)
            adj[v]=new Bag<Integer>();
    }
    
    public Graph(In in){
        this(in.readInt());
        int E=in.readInt();
        for(int i=0;i<E;i++){
            int v=in.readInt();
            int w=in.readInt();
            addEdge(v,w);
        }
    }

    /**
     * EX4.1.15
     */
    public Graph(StdIn in){
        String s=in.readLine();
        String[] word=s.split("\\s+");
        this.V=Integer.parseInt(word[0]);
        this.E=Integer.parseInt(word[2]);
        adj=(Bag<Integer>[]) new Bag[V];
        for(int v=0;v<V;v++)
            adj[v]=new Bag<>();
        for(int i=0;i<V;i++){
            String n=in.readLine();
            String[] words=n.split("\\s+");
            for(int j=1;j<words.length;j++)
                adj[i].add(Integer.parseInt(words[j]));
        }
    }

    /**
     * EX4.1.3
     */
    public Graph(Graph that){
        this(that.V);
        this.E=that.E;
        for(int v=0;v<V;v++)
            for(int w:that.adj[v])
                adj[v].add(w);
    }

    /**
     * EX4.1.4
     */
    public boolean hasEdge(int v, int w){
        for(int x:adj[v])
            if(w==x)
                return true;
        return false;
    }

    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    public void addEdge(int v, int w){
        if(v==w)        //不允许存在自环
            return;
        if(hasEdge(v, w))       //不允许存在平行边
            return;
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v){
        return adj[v];
    }

    public String toString(){
        String s=V+" vertices, "+E+" edges\n";
        for(int v=0;v<V;v++){
            s+=v+": ";
            for(int w:adj(v))
                s+=w+" ";
            s+="\n";
        }
        return s;
    }

    public static void main(String[] args) {
        Graph G=new Graph(new In(args[0]));
        StdOut.print(G.toString());
    }
}