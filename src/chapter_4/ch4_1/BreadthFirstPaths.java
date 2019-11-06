package chapter_4.ch4_1;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

public class BreadthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public BreadthFirstPaths(Graph G, int s){
        marked=new boolean[G.V()];
        edgeTo=new int[G.V()];
        this.s=s;
        bfs(G, s);
    }

    private void bfs(Graph G, int s){
        Queue<Integer> queue=new Queue<>();
        marked[s]=true;
        queue.enqueue(s);
        while (!queue.isEmpty()) {
            int v = queue.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.enqueue(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v){
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        if(!marked[v])
            return null;
        Stack<Integer> path=new Stack<>();
        for(int x=v;x!=s;x=edgeTo[x])
            path.push(x);
        path.push(s);
        return path;
    }

    /**
     * EX4.1.13
     */
    public int distTo(int v){
        int dist=0;
        for(int x=v;x!=s;x=edgeTo[x])
            dist++;
        return dist;
    }
}
