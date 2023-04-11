public class RoadLeft extends  Road{



    private String id = "Left";


    @Override
    String getId() {
        return this.id;
    }

    public void RoadLeftMove(){

        this.trafficSignal.notify(this,"Move");

    }

    public void RoadLeftStop(){

        this.trafficSignal.notify(this,"Stop");

    }

}
