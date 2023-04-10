public class Show extends HandlerMsgBase{

    @Override
    public void sendMassage(Massage massage) {

        if (massage.isCheck()){

            System.out.println("Check -----> Send ");
            System.out.println("Massage : "+massage.getMassageUser()+" To send number --> "+massage.getNumber());
            massage.setCheck(false);
            if(nextHandlerMsg != null){

                nextHandlerMsg.sendMassage(massage);
            }
            else {

                System.out.println("End Send ......");

            }

        }

        else {
            System.out.println("<----------Error----------->");
        }

    }

}
