import java.util.ArrayList;

public class Details implements Family{

    private String gender;
    private Integer age;
    private Job job;


    public Details(String $gender, Integer $age) {
        this.gender = $gender;
        this.age = $age;
        this.job =new Job();

    }


    @Override
    public ArrayList family() {
        ArrayList<Object> a = new ArrayList<Object>();
        a.add("gender ==>"+this.gender);
        a.add("age ==>"+this.age);
        a.add("job ==>"+this.job.family());
        return a;}
}

