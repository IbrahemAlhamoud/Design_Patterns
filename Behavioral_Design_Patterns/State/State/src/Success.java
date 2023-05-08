public class Success extends State{
    @Override
    public void nextStep() {

        System.out.println(massage.CHECK_SUCCESS);
        massage.setProcessStatus(massage.CHECK_SUCCESS);
        System.out.println("Send Success ..............");
        massage.transitionTo(new Done());

    }
}
