import java.awt.*;

public class TreeFlyweight {
    static String tree_name []={
      "apple",
      "orange",
      "banana"
    };

    static String tree_Size [] ={
      "10*10",
      "15*15",
      "20*20"

    };
    static Color tree_Color[] = {
            Color.GREEN,
            Color.ORANGE,
            Color.red
    };

    private String name;
    private Color color;
    private String size;

    public TreeFlyweight(String name, Color color, String size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public void draw (Graphics g,int x ,int y){
        g.setColor(Color.black);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);

    }

}
