public class concreteHouse implements HouseBuilder {

    private product pro;

    public void reset(){

        this.pro=new product();
    }

    public concreteHouse() {
        this.reset();
    }
    @Override
    public void createWall() {

        this.pro.addProduct("Build completed successfully...Wall");

    }

    @Override
    public void createRoof() {

        this.pro.addProduct("Build completed successfully...Roof");

    }

    @Override
    public void createDoor() {
        this.pro.addProduct("Build completed successfully...Door");
    }

    @Override
    public void createWindows() {
        this.pro.addProduct("Build completed successfully...Windows");
    }

    @Override
    public void createSwimmingpool() {

        this.pro.addProduct("Build completed successfully...SwimmingPool");

    }

    @Override
    public void createSecondFloor() {

        this.pro.addProduct("Build completed successfully...SecondFloor");

    }

    @Override
    public product getAll() {

       product rest=this.pro;
       this.reset();
        return rest;
    }

}
