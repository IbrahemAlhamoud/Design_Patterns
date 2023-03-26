import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = o.nextLine();

        Scanner o1 = new Scanner(System.in);
        System.out.println("Enter password");
        String password = o1.nextLine();

        proxyLock p =new proxyLock(userName,password);
        p.Show();

    }
}