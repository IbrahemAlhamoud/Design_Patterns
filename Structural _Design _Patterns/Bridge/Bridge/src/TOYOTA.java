public class TOYOTA extends Car{

    public TOYOTA(Color color) {
        super(color);
        this.setName("TOYOTA");
    }

    @Override
    void CarDetails() {
        System.out.println("The Car "+this.getName()+" :Color --> "+this.color.getColor());
    }
}
