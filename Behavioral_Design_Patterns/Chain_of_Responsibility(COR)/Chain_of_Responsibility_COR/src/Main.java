import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner o = new Scanner(System.in);
        System.out.println("Enter number");
        String num = o.nextLine();



        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter massage");
        String msg = o1.nextLine();


        Massage m = new Massage(num,msg);


        CheckNumber checkNumber = new CheckNumber();
        CheckPoints checkPoints = new CheckPoints();
        Show show = new Show();


        checkNumber.setNextHandler(checkPoints).setNextHandler(show);

        checkNumber.sendMassage(m);
    }
}