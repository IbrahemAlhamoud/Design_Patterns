public class Massage {

    private  String number ;
    private  String massageUser;

    private  boolean check = false;



    public Massage(String number, String massageUser) {
        this.number = number;
        this.massageUser = massageUser;
    }

    public String getNumber() {
        return number;
    }

    public String getMassageUser() {
        return massageUser;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

}


