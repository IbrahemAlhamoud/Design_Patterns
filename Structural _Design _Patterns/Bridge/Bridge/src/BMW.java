public class BMW extends Car{

    public BMW(Color color) {
        super(color);
        this.setName("BMW");
    }

    @Override
    void CarDetails() {
        System.out.println("The Car "+this.getName()+" :Color --> "+this.color.getColor());
    }
}
