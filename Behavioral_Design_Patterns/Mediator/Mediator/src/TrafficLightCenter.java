public class TrafficLightCenter implements TrafficSignal{
    private RoadLeft roadLeft;
    private RoadRight roadRight;
    private PedestrianRoad pedestrianRoad;

    public TrafficLightCenter(RoadLeft roadLeft, RoadRight roadRight, PedestrianRoad pedestrianRoad) {
        this.roadLeft = roadLeft;
        roadLeft.setTrafficSignal(this);
        this.roadRight = roadRight;
        roadRight.setTrafficSignal(this);
        this.pedestrianRoad = pedestrianRoad;
        pedestrianRoad.setTrafficSignal(this);
    }

    private void Show(){
        System.out.println("RoadRight ---> "+this.roadRight.getStatusRoad());
        System.out.println("RoadLeft ---> "+this.roadLeft.getStatusRoad());
        System.out.println("RoadPedestrian ---> "+this.pedestrianRoad.getStatusRoad());
    }

    @Override
    public void notify(Road road, String event) {

        if(road.getId().equals("Right")){
            if(event.equals("Move")){
                this.roadRight.move();
                this.roadLeft.stop();
                this.pedestrianRoad.stop();
                this.Show();
            } else if (!(Road.isLock())) {

                this.roadLeft.move();
                this.roadRight.stop();
                this.pedestrianRoad.stop();
                this.Show();
                this.roadLeft.setLock(true);

            } else if (Road.isLock()) {

                this.roadLeft.stop();
                this.roadRight.stop();
                this.pedestrianRoad.move();
                this.Show();
                this.pedestrianRoad.setLock(false);

            }

        } else if (road.getId().equals("Left")) {

            if(event.equals("Move")){
                this.roadRight.stop();
                this.roadLeft.move();
                this.pedestrianRoad.stop();
                this.Show();
            } else if (!(Road.isLock())) {

                this.roadLeft.stop();
                this.roadRight.move();
                this.pedestrianRoad.stop();
                this.Show();
                this.roadRight.setLock(true);

            } else if (Road.isLock()) {

                this.roadLeft.stop();
                this.roadRight.stop();
                this.pedestrianRoad.move();
                this.Show();
                this.pedestrianRoad.setLock(false);

            }

        } else if (road.getId().equals("pedestrian")) {

            if(event.equals("Move")){
                this.roadRight.stop();
                this.roadLeft.stop();
                this.pedestrianRoad.move();
                this.Show();
            } else if (!(Road.isLock())) {

                this.roadLeft.stop();
                this.roadRight.move();
                this.pedestrianRoad.stop();
                this.Show();
                this.roadRight.setLock(true);

            } else if (Road.isLock()) {

                this.roadLeft.move();
                this.roadRight.stop();
                this.pedestrianRoad.stop();
                this.Show();
                this.roadLeft.setLock(false);

            }

        }

    }
}
