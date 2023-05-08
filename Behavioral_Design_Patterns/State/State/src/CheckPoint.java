public class CheckPoint extends State {
    @Override
    public void nextStep() {

        System.out.println(massage.CHECK_POINT);
        massage.setProcessStatus(massage.CHECK_POINT);

        if (massage.getPoint() >= 10) {

            System.out.println("Check -----> OK point ");
            Integer p = massage.getPoint();
            massage.setPoint(p - 10);
            System.out.println("Deduct 10 points for sending the message ......");
            System.out.println("Your current points are ---> " + massage.getPoint());
            massage.transitionTo(new SendMassage());

        } else {
            System.out.println("Your current points are not enough ....." + massage.getPoint());
            massage.transitionTo(new Fail());
        }
    }
}
