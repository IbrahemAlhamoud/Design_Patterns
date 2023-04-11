public class PedestrianRoad extends  Road{

    private String id = "pedestrian";

    @Override
    String getId() {
        return this.id;
    }
    public void RoadPedestrianMove(){

        this.trafficSignal.notify(this,"Move");

    }

    public void RoadPedestrianStop(){

        this.trafficSignal.notify(this,"Stop");

    }
}
