import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.LinkedList;

public class BaseDecorator implements Massege{

    protected Massege massege;

    public BaseDecorator(Massege massege) {
        this.massege = massege;

    }


    @Override
    public LinkedList sendMassege() {

        return this.massege.sendMassege();
    }
}
