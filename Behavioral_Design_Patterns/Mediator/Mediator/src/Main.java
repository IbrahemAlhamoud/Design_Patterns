

public class Main {

        public static void main (String[]args){

            RoadRight roadRight = new RoadRight();
            RoadLeft roadLeft = new RoadLeft();
            PedestrianRoad pedestrianRoad = new PedestrianRoad();

            TrafficLightCenter trafficLightCenter = new TrafficLightCenter(roadLeft, roadRight, pedestrianRoad);

            roadRight.RoadRightMove();
            System.out.println("====================");
            roadRight.RoadRightStop();
            System.out.println("====================");
            roadRight.RoadRightStop();

            System.out.println("====================");
            roadLeft.RoadLeftMove();
            System.out.println("====================");
            roadLeft.RoadLeftStop();
            System.out.println("====================");
            roadLeft.RoadLeftStop();

            System.out.println("====================");
            pedestrianRoad.RoadPedestrianMove();
            System.out.println("====================");
            pedestrianRoad.RoadPedestrianStop();
            System.out.println("====================");
            pedestrianRoad.RoadPedestrianStop();


        }
}
