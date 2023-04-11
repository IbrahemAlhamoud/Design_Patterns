public class RoadRight extends Road{

    private String id = "Right";

    @Override
    String getId() {
        return this.id;
    }
    public void RoadRightMove(){

        this.trafficSignal.notify(this,"Move");

    }

    public void RoadRightStop(){

        this.trafficSignal.notify(this,"Stop");

    }
}
