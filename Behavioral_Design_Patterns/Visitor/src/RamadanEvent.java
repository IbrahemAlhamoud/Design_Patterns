public class RamadanEvent implements Visitor{
    @Override
    public void Visitor512KB(SubscribersForSpeed512KB speed512KB) {

        System.out.println("Welcome to the Ramadan event. Dear subscribers," +
                " we inform you of an increase in the size of the package at a speed of 512 KB," +
                " as the cost of the package remains the same. thank you all");

        speed512KB.setPackages512KB(100);
        speed512KB.getDetails();

    }

    @Override
    public void Visitor2Mb(SubscribersForSpeed2MB speed2MB) {

        System.out.println("Welcome to the Ramadan event. Dear subscribers," +
                " we inform you of an increase in the size of the package at a speed of 2 MB," +
                " as the cost of the package remains the same. thank you all");

        speed2MB.setPackages2MB(180);
        speed2MB.getDetails();

    }


    @Override
    public void Visitor8MB(SubscribersForSpeed8Mb speed8Mb) {

        System.out.println("Welcome to the Ramadan event. Dear subscribers," +
                " we inform you of an increase in the size of the package at a speed of 8 MB," +
                " as the cost of the package remains the same. thank you all");

        speed8Mb.setPackages8MB(280);
        speed8Mb.getDetails();



    }


}
