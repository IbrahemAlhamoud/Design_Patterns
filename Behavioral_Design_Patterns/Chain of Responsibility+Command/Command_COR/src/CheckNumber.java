public class CheckNumber extends HandlerMsgBase{

    @Override
    public void sendMassage(Massage massage) {

        if (massage.getNumber().length()==10){

            System.out.println("Check -----> OK (10 number) ");
            CommandHistory.getPrintMsg().add("Check -----> OK (10 number) ");
            if(nextHandlerMsg != null){

                nextHandlerMsg.sendMassage(massage);
            }
            else {

                CommandHistory.getPrintMsg().add("End Send ......");
                System.out.println("End Send ......");

            }

        }

        else {

            CommandHistory.getPrintMsg().add("number not count 10 .....");
            System.out.println("number not count 10 .....");
        }

    }

}
