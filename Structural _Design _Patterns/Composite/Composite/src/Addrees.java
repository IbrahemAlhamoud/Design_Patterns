import java.util.ArrayList;

public class Addrees implements Family{
    private String streetName;
    private String city;
    ArrayList<Object> a = new ArrayList<Object>();

    public Addrees(String streetName, String city) {
        this.streetName = streetName;
        this.city = city;
    }


    @Override
    public ArrayList family() {

        a.add("streetName ==>"+this.streetName);
        a.add("city ==>"+this.city);
        return a;
    }
}
