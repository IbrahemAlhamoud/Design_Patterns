import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Massege:");
        String massege = myObj.nextLine();
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter Driver:");
        String driver = myObj1.nextLine();
        String driver1=driver.trim();

        Factory f = new concreteFactoryLaptop(massege,driver1);
        f.show();
        System.out.println("---------------------------------------------------------");
        Factory f1 = new concreteFactoryMobile(massege,driver1);
        f1.show();

    }
}