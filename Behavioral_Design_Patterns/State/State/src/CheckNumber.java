public class CheckNumber extends State {
    @Override
    public void nextStep() {

        System.out.println(massage.CHECK_NUMBER);
        massage.setProcessStatus(massage.CHECK_NUMBER);

        if (massage.getNumber().length() == 10) {

            System.out.println("Check -----> OK (10 number) ");
            massage.transitionTo(new CheckPoint());
        } else {
            System.out.println("number not count 10 .....");
            massage.transitionTo(new Fail());
        }
    }
}
