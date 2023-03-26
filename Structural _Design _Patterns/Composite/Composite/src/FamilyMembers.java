import java.util.ArrayList;
import java.util.PrimitiveIterator;

public  class  FamilyMembers implements Family {
    private int id;
    private String name;
    private Addrees addrees;
    private Details details;

    private ArrayList<Family> children= new ArrayList<Family>();


    public FamilyMembers(Integer id, String name, Addrees addrees, Details details) {
        this.id = id;
        this.name = name;
        this.addrees = addrees;
        this.details = details;
    }


    public void addChildren(Family f){
       this.children.add(f);

    }

    private void show(ArrayList a){
        ArrayList<Object> b = new ArrayList<Object>();
        ArrayList<Family> families = this.children;
        if (!(families.isEmpty())) {
            for (int i = 0; i < families.size(); i++) {
                Family f = families.get(i);
                b.add(f.family());
            }
            a.add("Childrens ==>" + b + "\n");
        }
        else {
            a.add("Childrens==> null");
        }
    }

    @Override
    public ArrayList family() {
        ArrayList<Object> a = new ArrayList<Object>();
        a.add("id ==>"+this.id);
        a.add("name ==>"+this.name+"\n");
        this.show(a);
        a.add("Address ==>"+this.addrees.family());
        a.add("Details ==>"+this.details.family());

    return a;}
}
