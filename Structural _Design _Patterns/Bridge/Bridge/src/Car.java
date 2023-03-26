public abstract class Car {
    private String name;
    protected Color color;

    public Car(Color color) {
        this.EditColor(color);
    }

    public void EditColor(Color color){
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    abstract void CarDetails();
}
