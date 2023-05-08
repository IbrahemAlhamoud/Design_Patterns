public class Fail extends State{
    @Override
    public void nextStep() {

        System.out.println(massage.CHECK_FAIL);
        massage.setProcessStatus(massage.CHECK_FAIL);
        System.out.println("Fail Send .........");
        massage.transitionTo(new Done());

    }
}
