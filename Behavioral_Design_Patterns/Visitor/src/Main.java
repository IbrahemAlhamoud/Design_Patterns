public class Main {
    public static void main(String[] args) {


        SubscribersForSpeed512KB speed512KB = new SubscribersForSpeed512KB();
        SubscribersForSpeed2MB speed2MB = new SubscribersForSpeed2MB();
        SubscribersForSpeed8Mb speed8Mb = new SubscribersForSpeed8Mb();
        RamadanEvent ramadanEvent = new RamadanEvent();
        speed512KB.accept(ramadanEvent);
        speed2MB.accept(ramadanEvent);
        speed8Mb.accept(ramadanEvent);

        System.out.println("-------------------------------------------");


        eventBeginningOfTheYear eventBeginningOfTheYear = new eventBeginningOfTheYear();

        speed512KB.accept(eventBeginningOfTheYear);
        speed2MB.accept(eventBeginningOfTheYear);
        speed8Mb.accept(eventBeginningOfTheYear);


    }
}