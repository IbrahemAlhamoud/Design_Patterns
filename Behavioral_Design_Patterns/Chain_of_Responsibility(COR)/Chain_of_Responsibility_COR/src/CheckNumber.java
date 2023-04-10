public class CheckNumber extends HandlerMsgBase{

    @Override
    public void sendMassage(Massage massage) {

        if (massage.getNumber().length()==10){

            System.out.println("Check -----> OK (10 number) ");
            if(nextHandlerMsg != null){

                nextHandlerMsg.sendMassage(massage);
            }
            else {

                System.out.println("End Send ......");

            }

        }

        else {
            System.out.println("number not count 10 .....");
        }

    }

}
