public class Main {
    public static void main(String[] args) {
        Director director =new Director();
        HouseBuilder fram = new concreteFarm();
        HouseBuilder house = new concreteHouse();
        System.out.println("-----------------House-----------------");
        director.setBuilder(house);
        director.BuilderAll();
        product pro =house.getAll();
        pro.getproduct();
        System.out.println("------------------Fram---------------");
        director.setBuilder(fram);
        director.BuilderAll();
        product prod =fram.getAll();
        prod.getproduct();


    }
}