import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFactory {
     abstract Cpu createCpu();
     abstract GraphicCard createGraphicCard();
    static void show(AbstractFactory f){
          List<String> s = new ArrayList<String>();
          s.add(f.createCpu().getCpu());
          s.add(f.createGraphicCard().getGraphicCard());
          for (String d: s) {
               System.out.println(d);
          }
          s.clear();
     };
}
