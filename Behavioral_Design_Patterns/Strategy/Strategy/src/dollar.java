public class dollar implements  currencyConverterStrategy{
    @Override
    public void Convert(Integer currency) {

        System.out.println("Convert the currency from the dollar  to the Syrian pound");
        Integer cost = currency * 8500;
        System.out.println("cost ---> "+ cost + " SP");

    }
}
