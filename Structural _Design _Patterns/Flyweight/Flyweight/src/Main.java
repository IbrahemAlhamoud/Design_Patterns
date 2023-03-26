import java.awt.*;
import java.util.Random;

public class Main {
    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 1000000;


    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) {

        forest f =new forest();
        Random random1 = new Random();
        Random random2 = new Random();
        Random random3 = new Random();

        for (int i = 0; i < TREES_TO_DRAW; i++) {
            f.add(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    TreeFlyweight.tree_name[random1.nextInt(3)],
                    TreeFlyweight.tree_Color[random2.nextInt(3)],
                    TreeFlyweight.tree_Size[random3.nextInt(3)]);
        }

        f.setSize(CANVAS_SIZE, CANVAS_SIZE);
        f.setVisible(true);

        f.drawAll(f.getGraphics());


    }
}