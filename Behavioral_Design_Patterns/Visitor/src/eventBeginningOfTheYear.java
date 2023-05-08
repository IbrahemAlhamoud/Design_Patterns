public class eventBeginningOfTheYear implements Visitor{


    @Override
    public void Visitor512KB(SubscribersForSpeed512KB speed512KB) {

        System.out.println("Welcome to our start-of-the-year event. Dear subscribers," +
                " we inform you of an increase in the speed fee by 512 KB," +
                " as the package size remains the same. thank you all");

        speed512KB.setCost512KB(10000);
        speed512KB.getDetails();

    }

    @Override
    public void Visitor2Mb(SubscribersForSpeed2MB speed2MB) {


        System.out.println("Welcome to our start-of-the-year event. Dear subscribers," +
                " we inform you of an increase in the speed fee by 2 MB," +
                " as the package size remains the same. thank you all");

        speed2MB.setCost2MB(18000);
        speed2MB.getDetails();

    }

    @Override
    public void Visitor8MB(SubscribersForSpeed8Mb speed8Mb) {

        System.out.println("Welcome to our start-of-the-year event. Dear subscribers," +
                " we inform you of an increase in the speed fee by 8 MB," +
                " as the package size remains the same. thank you all");

        speed8Mb.setCost8MB(30000);
        speed8Mb.getDetails();

    }
}
