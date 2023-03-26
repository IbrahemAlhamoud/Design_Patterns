import java.util.*;

public class SMS implements Massege{

    private String msg;
    private String numberPhone;
    private Integer Price = 20;




    public SMS(String msg, String numberPhone) {
        this.msg = msg;
        this.numberPhone = numberPhone;
    }



    @Override
    public LinkedList sendMassege() {

        LinkedList<Object> s =new LinkedList<>();
        s.add("The message was sent through the number--> "+this.numberPhone);
        s.add("The message --> "+this.msg);
        s.add("amount has been deducted --> ");
        s.add(this.Price);
        s.add("Thank you for using our services");


    return s;}
}
