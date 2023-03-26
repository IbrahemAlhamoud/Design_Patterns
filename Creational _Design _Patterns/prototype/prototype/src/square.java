public class square extends prototypeClone {
    private int position;


    public square(int x, int y, int pos) {

        super(x,y);
        this.position = pos;

    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return new square(this.getX(),this.getY(),this.getPosition());

    }

    @Override
    public String GetAll() {
        return ("position= "+this.position+","+this.getShape());
    }
}
