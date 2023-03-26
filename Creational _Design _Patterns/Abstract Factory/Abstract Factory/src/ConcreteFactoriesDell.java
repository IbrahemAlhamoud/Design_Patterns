public class ConcreteFactoriesDell extends AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new ConcreteProductsDellCpu();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new ConcreteProductsDellGraphicCard();
    }
}
