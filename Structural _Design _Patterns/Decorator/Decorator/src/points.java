import java.util.LinkedList;

public class points extends BaseDecorator {
    public points(Massege massege) {
        super(massege);
    }

    @Override
    public LinkedList sendMassege() {
        LinkedList<Object> s1 = super.sendMassege();

        Integer price = (Integer) s1.get(3) + 10;
        s1.set(3,price);
        s1.set(2,"You have been given an additional 10 lira to your balance for using the points status And it became:");
        s1.addFirst("<-----The message was sent in Points mode---->");
        s1.add(5,"Your points have been deducted");


        return s1;
    }
}
