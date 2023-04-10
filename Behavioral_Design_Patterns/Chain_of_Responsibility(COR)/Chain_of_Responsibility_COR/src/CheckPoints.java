public class CheckPoints extends HandlerMsgBase {

    @Override
    public void sendMassage(Massage massage) {

        if (massage.getPoint()>=10){

            System.out.println("Check -----> OK point ");
            Integer p = massage.getPoint();
            massage.setPoint(p-10);
            System.out.println("Deduct 10 points for sending the message ......");
            System.out.println("Your current points are ---> "+massage.getPoint());
            massage.setCheck(true);
            if(nextHandlerMsg != null){

                nextHandlerMsg.sendMassage(massage);
            }
            else {

                System.out.println("End Send ......");

            }

        }

        else {
            System.out.println("Your current points are not enough ....."+massage.getPoint());
        }

    }
}
