public class  SubscribersForSpeed512KB implements InternetSpeedSubscribers{

    private  Integer cost512KB ;
    private Integer packages512KB ;


    public SubscribersForSpeed512KB() {

        this.cost512KB=8500;
        this.packages512KB=75;
    }


    public void setCost512KB(Integer cost512KB) {
        this.cost512KB = cost512KB;
    }

    public void setPackages512KB(Integer packages512KB) {
        this.packages512KB = packages512KB;
    }

    @Override
    public void accept(Visitor visitor) {

        System.out.println("Speed512KB");
        visitor.Visitor512KB(this);

    }

    @Override
    public Integer getCost() {
        return this.cost512KB;
    }

    @Override
    public Integer getPackages() {
        return this.packages512KB;
    }

    @Override
    public void getDetails() {

        System.out.println("Dear speed 512kB subscribers");
        System.out.println("we inform you that the size of your package is "+this.getPackages()+ " GB");
        System.out.println("And Cost .... "+this.getCost()+" SP");

    }
}
