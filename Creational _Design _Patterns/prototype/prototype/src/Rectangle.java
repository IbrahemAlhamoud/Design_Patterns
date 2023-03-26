public class Rectangle extends prototypeClone {

    public Rectangle(int x ,int y) {
        super(x,y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return new Rectangle(this.getX(),this.getY());
    }

    @Override
    public String GetAll() {
        return this.getShape();
    }
}
