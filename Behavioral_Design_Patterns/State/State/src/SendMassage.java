public class SendMassage extends State{
    @Override
    public void nextStep() {

        System.out.println(massage.CHECK_SEND);
        massage.setProcessStatus(massage.CHECK_SEND);
        System.out.println("Massage : "+massage.getMassage()+" To send number --> "+massage.getNumber());
        massage.transitionTo(new Success());
    }
}
