import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AbstractFactory.show(new ConcreteFactoriesDell());
        System.out.println("--------------------------------");
        AbstractFactory.show(new ConcreteFactoriesAsus());


    }

}