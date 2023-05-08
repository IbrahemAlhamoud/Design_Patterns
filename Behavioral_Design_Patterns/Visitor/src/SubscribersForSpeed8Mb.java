public class SubscribersForSpeed8Mb implements InternetSpeedSubscribers{

    private  Integer cost8MB ;
    private Integer packages8MB ;

    public SubscribersForSpeed8Mb() {

        this.cost8MB=26000;
        this.packages8MB=240;
    }

    @Override
    public void accept(Visitor visitor) {

        System.out.println("Speed8MB");
        visitor.Visitor8MB(this);

    }

    public void setCost8MB(Integer cost8MB) {
        this.cost8MB = cost8MB;
    }

    public void setPackages8MB(Integer packages8MB) {
        this.packages8MB = packages8MB;
    }

    @Override
    public Integer getCost() {
        return this.cost8MB;
    }

    @Override
    public Integer getPackages() {
        return this.packages8MB;
    }

    @Override
    public void getDetails() {

        System.out.println("Dear speed 8MB subscribers");
        System.out.println("we inform you that the size of your package is "+this.getPackages()+ " GB");
        System.out.println("And Cost .... "+this.getCost()+" SP");

    }
}
