public class MyMassage {

    final String CHECK_NUMBER ="Check Number";
    final String CHECK_POINT ="Check Point";
    final String CHECK_FAIL = "Check Fail";
    final String CHECK_SUCCESS = "Check Success";
    final String CHECK_SEND = "Check Send";
    final String CHECK_DONE = "Done";
    private State state;
    private String massage;

    private  String number;

    private String processStatus;

    private Integer Point = 50;

    public MyMassage(String number,String massage) {

        this.number=number;
        this.massage=massage;
        this.transitionTo(new CheckNumber());


    }

    public void transitionTo(State state){

        this.state=state;
        this.state.setMassage(this);

    }

    public void nextStep(){
        this.state.nextStep();
    }

    public String getMassage() {
        return massage;
    }

    public String getNumber() {
        return number;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public void setPoint(Integer point) {
        Point = point;
    }

    public Integer getPoint() {
        return Point;
    }
}
