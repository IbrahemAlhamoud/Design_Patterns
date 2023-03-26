public class Main {
    public static void main(String[] args) {

        Company1 c1 = new Company1();
        c1.setName("ibrahem");
        c1.setAge(24);
        c1.setSalary(300);
        c1.Show(c1.getSalary());
        Company2 c2 = new Company2();
        c2.setName("ibrahem");
        c2.setAge(24);
        c2.setSalary(1000);
        Adapter ad = new Adapter();
        c2.Show(ad.CalcSalary(c2));

    }
}