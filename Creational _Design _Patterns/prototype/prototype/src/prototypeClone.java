public abstract class prototypeClone implements Cloneable{

    private int x ;
    private int y;


    public prototypeClone(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    String getShape(){
        return ("x="+this.x+" ,y="+this.y);
    }
    @Override
    abstract public Object clone() throws CloneNotSupportedException;
    abstract public String GetAll();

}
