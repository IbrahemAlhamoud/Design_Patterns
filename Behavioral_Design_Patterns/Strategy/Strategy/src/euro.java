public class euro implements currencyConverterStrategy{
    @Override
    public void Convert(Integer currency) {

        System.out.println("Convert the currency from the euro  to the Syrian pound");
        Integer cost = currency * 9000;
        System.out.println("cost ---> "+ cost + " SP");


    }
}
