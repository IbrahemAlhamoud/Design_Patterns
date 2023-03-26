public class TESLA extends Car{

    public TESLA(Color color) {
        super(color);
        this.setName("TESLA");
    }

    @Override
    void CarDetails() {

        System.out.println("The Car "+this.getName()+" :Color --> "+this.color.getColor());

    }
}
