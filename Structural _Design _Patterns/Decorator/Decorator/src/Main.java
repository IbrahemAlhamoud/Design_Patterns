import java.util.*;

public class Main {

    public static Dictionary show(Massege m){
        LinkedList s = m.sendMassege();
        for (Object m1: s) {
            System.out.println(m1);
//            System.out.println(s.get(m1));
        }
        return null;
    }
    public static void main(String[] args) {



        Scanner n = new Scanner(System.in);
        System.out.println("Enter masssge");
        String massage = n.nextLine();


        Scanner n1 = new Scanner(System.in);
        System.out.println("Enter numberPhone");
        String numberPhone = n1.nextLine();

        Massege m =new SMS(massage,numberPhone);
        show(m);
        System.out.println("---------------------------------------");
        Massege m1=new EmergencyMessage(m);
        show(m1);
        System.out.println("---------------------------------------");
        Massege m2 =new points(m);
        show(m2);



    }
}