import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class forest extends JFrame {

    private ArrayList<TreeContext> a = new ArrayList<>();

    public void add(int x, int y , String name , Color color ,String size){
       TreeFlyweight t1 = TreeFactory.getTreeFactory(name,color,size);
       TreeContext t2 = new TreeContext(x,y,t1);
       a.add(t2);

    }

    public void drawAll(Graphics g){
        for (TreeContext tree:a) {
            tree.draw(g);
        }
    }
}
