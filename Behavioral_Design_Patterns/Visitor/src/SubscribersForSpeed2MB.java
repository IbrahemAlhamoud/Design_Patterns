public class SubscribersForSpeed2MB implements InternetSpeedSubscribers{

    private  Integer cost2MB ;
    private Integer packages2MB ;


    public SubscribersForSpeed2MB() {

        this.cost2MB=15000;
        this.packages2MB=140;

    }

    public void setCost2MB(Integer cost) {
        this.cost2MB = cost;
    }



    public void setPackages2MB(Integer packages) {
        this.packages2MB = packages;
    }


    @Override
    public void accept(Visitor visitor) {
        System.out.println("Speed2MB");
        visitor.Visitor2Mb(this);
    }

    @Override
    public Integer getCost() {
        return this.cost2MB;
    }

    @Override
    public Integer getPackages() {
        return this.packages2MB;
    }

    @Override
    public void getDetails() {

        System.out.println("Dear speed 2MB subscribers");
        System.out.println("we inform you that the size of your package is "+this.getPackages() + " GB");
        System.out.println("And Cost .... "+this.getCost()+" SP");
    }
}
