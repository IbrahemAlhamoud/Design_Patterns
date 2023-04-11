public abstract class Road {

    private String statusRoad ="";
    private String Move = "Move";
    private String Stop ="Stop";
    private static boolean lock = false;

    protected  TrafficSignal trafficSignal;

    public void setTrafficSignal(TrafficSignal trafficSignal) {
        this.trafficSignal = trafficSignal;
    }

    public void move() {
        this.statusRoad=this.Move;
    }

    public void stop() {
        this.statusRoad=this.Stop;
    }

    public String getStatusRoad() {
        return statusRoad;
    }

    public static boolean isLock() {
        return lock;
    }

    public void  setLock(boolean lock) {
        this.lock = lock;
    }

    abstract String getId();


}
