import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        System.out.println("Enter number");
        String num = o.nextLine();



        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter massage");
        String msg = o1.nextLine();

        MyMassage massage = new MyMassage(num,msg);

        massage.nextStep();
        massage.nextStep();
        massage.nextStep();
        massage.nextStep();
        massage.nextStep();

    }
}