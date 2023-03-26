import java.awt.*;
import java.util.HashMap;

public class TreeFactory {
    static HashMap<String,TreeFlyweight> tree = new HashMap<>();
    public static  TreeFlyweight getTreeFactory(String name , Color color,String size){

        TreeFlyweight t=tree.get(name);
        if(t==null){
            t=new TreeFlyweight(name,color,size);
            tree.put(name,t);
        }
        System.out.println("Total Count For unique object saved on RAM --> "+tree.size());
        return t;
    }

}
