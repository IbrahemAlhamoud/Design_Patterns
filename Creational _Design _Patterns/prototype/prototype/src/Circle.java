public class Circle extends prototypeClone{
    public int radius;

    public Circle(int x, int y,int rad) {
        super(x,y);
        this.radius=rad;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Circle(this.getX(),this.getY(),this.getRadius());
    }

    @Override
    public String GetAll() {
        return ("radius= "+this.radius+","+this.getShape());
    }
}
