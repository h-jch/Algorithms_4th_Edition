package chapter_2.ch2_5;

/**
 * Version
 */
public class Version implements Comparable<Version>{
    private int x;
    private int y;
    private int z;

    public Version(int x, int y, int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public int compareTo(Version that){
        if(this.x<that.x)
            return -1;
        if(this.x>that.x)
            return 1;
        if(this.y<that.y)
            return -1;
        if(this.y>that.y)
            return 1;
        if(this.z<this.z)
            return -1;
        if(this.z>that.z)
            return 1;
        return 0;
    }
    
}