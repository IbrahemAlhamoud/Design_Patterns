public class Main {
    public static void main(String[] args) {


        System.out.println("Enter the value of the dollar, euro, or Kuwaiti dinar and convert its value to the Syrian pound");

        System.out.println("-----------------------dollar-------------------------");

        convertContext convertContext = new convertContext(new dollar());
        convertContext.setCurrency(20);
        convertContext.convertCurrency();

        System.out.println("-----------------------euro-------------------------");


        convertContext.setCurrency(100);
        convertContext.setCurrencyConverterStrategy(new euro());
        convertContext.convertCurrency();

        System.out.println("----------------------KuwaitiDinar------------------------------");

        convertContext.setCurrency(50);
        convertContext.setCurrencyConverterStrategy(new KuwaitiDinar());
        convertContext.convertCurrency();

    }
}