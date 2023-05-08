public class convertContext {

    private currencyConverterStrategy currencyConverterStrategy;
    Integer currency ;

    public convertContext(currencyConverterStrategy currencyConverterStrategy) {
        this.currencyConverterStrategy = currencyConverterStrategy;
    }

    public void setCurrencyConverterStrategy(currencyConverterStrategy currencyConverterStrategy) {
        this.currencyConverterStrategy = currencyConverterStrategy;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public  void convertCurrency (){

        this.currencyConverterStrategy.Convert(currency);
    }
}
