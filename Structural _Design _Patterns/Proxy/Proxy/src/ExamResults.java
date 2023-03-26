import java.util.Random;

public class ExamResults  implements Show{




    @Override
    public void Show() {
        Random random = new Random();
        System.out.println("mathematics ---> "+random.nextInt(10)+1);
        System.out.println("language ---> "+random.nextInt(10)+1);
        System.out.println("chemistry ---> "+random.nextInt(10)+1);
        System.out.println("computer ---> "+random.nextInt(10)+1);


    }
}
