package chapter_3.ch3_5;

/**
 * HashSETdouble
 */
public class HashSETdouble {
    private int M=16;
    private int N;
    private Double[] set;

    public HashSETdouble(){
        set=new Double[M];
    }
    
    public HashSETdouble(int cap){
        M=cap;
        set=new Double[M];
    }

    public int hash(Double key){
        return (key.hashCode()&0x7fffffff)%M;
    }

    private void resize(int cap){
        HashSETdouble s=new HashSETdouble(cap);
        for(int i=0;i<M;i++)
            if(set[i]!=null)
                s.add(set[i]);
        set=s.set;
        M=s.M;
    }

    public void add(Double key){
        if(N>=M/2)
            resize(M*2);
        int i;
        for(i=hash(key);set[i]!=null;i=(i+1)%M)
            if(set[i].equals(key))
                return;
        set[i]=key;
        N++;
    }

    public void delete(Double key){
        for(int i=hash(key);set[i]!=null;i=(i+1)%M)
            if(set[i].equals(key))
                set[i]=null;
        N--;
        if(N>0&&N==M/8)
            resize(M/2);
    }

    public boolean isEmpty(){
        return N==0;
    }

    public boolean contains(Double key){
        for(int i=hash(key);set[i]!=null;i=(i+1)%M){
            if(set[i].equals(key))
                return true;
        }
        return false;
    }

    public int size(){
        return N;
    }
}