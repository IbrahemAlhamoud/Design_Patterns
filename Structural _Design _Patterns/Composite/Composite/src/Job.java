import java.util.ArrayList;
import java.util.Random;

public class Job implements Family{

    private String[] jobs ={

            "Programmer",
            "Doctor",
            "Engineer"
    };



    @Override
    public ArrayList family() {
        ArrayList<Object> a = new ArrayList<Object>();
        Random random = new Random();

        a.add("job ==>"+this.jobs[random.nextInt(3)]);
        return a;
    }

}
