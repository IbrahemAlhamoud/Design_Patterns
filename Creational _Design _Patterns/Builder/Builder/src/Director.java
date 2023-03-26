public class Director {
    private  HouseBuilder builder ;
    public void setBuilder(HouseBuilder builder ){

        this.builder=builder;

    }
    public void BuilderAll(){
        this.builder.createWall();
        this.builder.createRoof();
        this.builder.createDoor();
        this.builder.createWindows();
        this.builder.createSwimmingpool();
        this.builder.createSecondFloor();
    }
}
