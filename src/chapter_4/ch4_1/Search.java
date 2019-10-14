package chapter_4.ch4_1;

/**
 * Search
 */
public class Search {
    private Graph G;
    private int s;
    private WeightedQuickUnionUF uf;

    public Search(Graph G, int s){
        this.G=G;
        this.s=s;
        uf=new WeightedQuickUnionUF(G.V());
        for(int v=0;v<G.V();v++)
            for(int w:G.adj(v))
                uf.union(v, w);
    }

    public boolean marked(int v){
        return uf.connected(s, v);
    }

    public int count(){
        return uf.sz[uf.find(s)];
    }
    
}