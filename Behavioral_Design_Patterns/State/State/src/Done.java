public class Done extends State {
    @Override
    public void nextStep() {


        if(this.massage.getMassage().equals(massage.CHECK_DONE)){

            System.exit(0);
        }

        System.out.println(massage.CHECK_DONE);
        massage.setProcessStatus(massage.CHECK_DONE);
        System.out.println("Done...................");
        //massage.transitionTo(new Done());

    }
}
