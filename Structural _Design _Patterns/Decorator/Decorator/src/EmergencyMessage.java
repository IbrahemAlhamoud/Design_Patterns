import java.util.*;

public class EmergencyMessage extends BaseDecorator {


    public EmergencyMessage(Massege massege) {
        super(massege);
    }

    @Override
    public LinkedList sendMassege() {
        LinkedList<Object> s1 = super.sendMassege();

        Integer price = (Integer) s1.get(3) + 20;
        s1.set(3,price);
        s1.addFirst("<-----The message was sent in emergency mode---->");


        return s1;
    }
}
