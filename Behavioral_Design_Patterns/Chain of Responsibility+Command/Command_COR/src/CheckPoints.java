public class CheckPoints extends HandlerMsgBase {

    @Override
    public void sendMassage(Massage massage) {

        if (CommandHistory.getPoint()>=10){

            CommandHistory.getPrintMsg().add("Check -----> OK point ");
            System.out.println("Check -----> OK point ");
            Integer p = CommandHistory.getPoint();
            CommandHistory.setPoint(p-10);
            CommandHistory.getPrintMsg().add("Deduct 10 points for sending the message ......");
            System.out.println("Deduct 10 points for sending the message ......");
            CommandHistory.getPrintMsg().add("Your current points are ---> "+CommandHistory.getPoint());
            System.out.println("Your current points are ---> "+CommandHistory.getPoint());
            massage.setCheck(true);
            if(nextHandlerMsg != null){

                nextHandlerMsg.sendMassage(massage);
            }
            else {

                CommandHistory.getPrintMsg().add("End Send ......");
                System.out.println("End Send ......");

            }

        }

        else {
            CommandHistory.getPrintMsg().add("Your current points are not enough ....."+CommandHistory.getPoint());
            System.out.println("Your current points are not enough ....."+CommandHistory.getPoint());
        }

    }
}
