import java.awt.*;

public class TreeContext {

    private int x;
    private int y;

    private TreeFlyweight treeFlyweight;

    public TreeContext(int x, int y, TreeFlyweight treeFlyweight) {
        this.x = x;
        this.y = y;
        this.treeFlyweight = treeFlyweight;
    }

    public void draw(Graphics g){
       this.treeFlyweight.draw(g,this.x,this.y);
    }
}
