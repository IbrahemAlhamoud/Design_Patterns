import java.util.ArrayList;

public class Composite implements Family{

    private ArrayList<Family> fa = new ArrayList<Family>();


    public void add (Family f){
        this.fa.add(f);
    }

    public  void remove(Family f){
        this.fa.remove(f);
    }

    public  void clear(){
        System.out.println("Clearing all");
        this.fa.clear();
    }
    @Override
    public ArrayList family() {

        ArrayList<Object> a = new ArrayList<Object>();

        for (Family f: this.fa) {

            a.add(f.family());

        }
    return a;}
}
