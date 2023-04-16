import java.util.LinkedList;

public class Control {

    private int Volume = 2;
    private boolean MobileStatusLock=false;
    private boolean AddStatusLock=false;

    private boolean MobileStatus=false;

    private LinkedList<String> next =CommandHistory.getAdd();




    public void setVolume(int volume) {
        Volume = volume;
    }


    public String OnM(){
        this.MobileStatusLock=true;
        this.MobileStatus=true;
        return "<--Mobile in operation mode-->";
    }

    public String OffM(){
        this.MobileStatusLock=false;
        this.MobileStatus=false;
        return "<--The mobile is closed-->";
    }

    public String VolumeUp(){
        int volume = this.Volume+1;
        setVolume(volume);
        return "<--Mobile sound increased "+volume+"-->";
    }

    public String VolumeDown(){
        int volume = this.Volume-1;
        setVolume(volume);
        return "<--Mobile sound decreased "+volume+"-->";
    }

    public String num0(){
        return "0";
    }

    public String num1(){
        return "1";
    }

    public String num2(){
        return "2";
    }

    public String num3(){
        return "3";
    }

    public String num4(){
        return "4";
    }

    public String num5(){
        return "5";
    }

    public String num6(){
        return "6";
    }

    public String num7(){
        return "7";
    }

    public String num8(){
        return "8";
    }

    public String num9(){
        return "9";
    }

    public String Add(){

        this.AddStatusLock=true;
        return "add ...";
    }

    public String Delete(int Delete){

        CommandHistory.getAdd().remove(Delete);
        System.out.println(CommandHistory.getAdd());
        this.AddStatusLock=true;
        return "Delete ...";
    }

    public String Next(int x ){

        return this.next.get(x);

    }

    public String previous(int x ){

        return this.next.get(x);

    }

    public String send(String number , String msg){

        Massage m = new Massage(number,msg);

        CheckNumber checkNumber = new CheckNumber();
        CheckPoints checkPoints = new CheckPoints();
        Show show = new Show();

        checkNumber.setNextHandler(checkPoints).setNextHandler(show);

        checkNumber.sendMassage(m);
        String add ="";
//        String s = String.valueOf(CommandHistory.getPrintMsg());
        for (String s : CommandHistory.getPrintMsg()) {
            add = add.concat(s+"\n");
        }
        CommandHistory.getPrintMsg().clear();
        return add;
    }

    public  boolean getMobileStatusLock(){
        return this.MobileStatusLock;
    }
    public int getVolume() {
        return this.Volume;
    }

    public boolean getMobileStatus() {
        return this.MobileStatus;
    }

    public void setAddStatusLock(boolean addStatusLock) {
        AddStatusLock = addStatusLock;
    }

    public boolean isAddStatusLock() {
        return AddStatusLock;
    }
}
