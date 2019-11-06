package chapter_4.ch4_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class CC {
    private boolean[] marked;
    private int[] id;
    private int count;

    public CC(Graph G){
        marked=new boolean[G.V()];
        id=new int[G.V()];
        this.count=0;
        for(int s=0;s<G.V();s++){
            if(!marked[s]){
                dfs(G, s);
                count++;
            }
        }
    }

    private void dfs(Graph G, int v){
        marked[v]=true;
        id[v]=count;
        for(int w:G.adj(v)){
            if(!marked[w])
                dfs(G, w);
        }
    }

    public boolean connected(int v, int w){
        return id[v]==id[w];
    }

    public int id(int v){
        return id[v];
    }

    public int count(){
        return count;
    }

}
