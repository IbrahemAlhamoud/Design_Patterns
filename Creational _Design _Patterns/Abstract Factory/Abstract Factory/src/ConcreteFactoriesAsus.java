public class ConcreteFactoriesAsus extends AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new ConcreteProductsAsusCpu();
    }

    @Override
    public GraphicCard createGraphicCard() {
        return new ConcreteProductsAsusGraphicCard();
    }
}
