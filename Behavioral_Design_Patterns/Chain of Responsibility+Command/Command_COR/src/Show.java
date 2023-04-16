public class Show extends HandlerMsgBase{

    @Override
    public void sendMassage(Massage massage) {

        if (massage.isCheck()){

            System.out.println("Check -----> Send ");
            CommandHistory.getPrintMsg().add("Check -----> Send ");
            System.out.println("Massage : "+massage.getMassageUser()+" To send number --> "+massage.getNumber());
            CommandHistory.getPrintMsg().add("Massage : "+massage.getMassageUser()+" To send number --> "+massage.getNumber());
            massage.setCheck(false);
            if(nextHandlerMsg != null){

                nextHandlerMsg.sendMassage(massage);
            }
            else {

                CommandHistory.getPrintMsg().add("End Send ......");
                System.out.println("End Send ......");

            }

        }

        else {

            CommandHistory.getPrintMsg().add("<----------Error----------->");
            System.out.println("<----------Error----------->");
        }

    }

}
