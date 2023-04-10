public class HandlerMsgBase implements HandlerMsg {

    protected   HandlerMsg nextHandlerMsg;



    @Override
    public HandlerMsg setNextHandler(HandlerMsg handlerMsg) {

        this.nextHandlerMsg= handlerMsg;

        return this.nextHandlerMsg;
    }

    @Override
    public void sendMassage(Massage massage) {

        this.nextHandlerMsg.sendMassage(massage);
    }
}
