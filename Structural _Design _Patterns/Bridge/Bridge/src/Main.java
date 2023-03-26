public class Main {
    public static void main(String[] args) {
        Color red =new Red();
        Color blue=new Blue();
        Color white=new White();

        Car Toyota =new TOYOTA(blue);
        Toyota.CarDetails();
        Toyota.EditColor(red);
        Toyota.CarDetails();
        System.out.println("----------------------------------");
        Car Tesla = new TESLA(white);
        Tesla.CarDetails();
        Tesla.EditColor(red);
        Tesla.CarDetails();

    }
}