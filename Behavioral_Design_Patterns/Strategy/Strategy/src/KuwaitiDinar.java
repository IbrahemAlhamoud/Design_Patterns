public class KuwaitiDinar implements currencyConverterStrategy{
    @Override
    public void Convert(Integer currency) {

        System.out.println("Convert the currency from the Kuwaiti dinar to the Syrian pound");
        Integer cost = currency * 28000;
        System.out.println("cost ---> "+ cost + " SP");
    }
}
