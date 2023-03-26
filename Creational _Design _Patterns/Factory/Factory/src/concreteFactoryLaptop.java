public class concreteFactoryLaptop implements Factory{

    private String dr;
    private String mg;
    private String enter = "Laptop";

    public concreteFactoryLaptop(String mg, String dr) {
        this.mg = mg;
        this.dr = dr;

    }

    @Override
    public prodect sendMassge() {
          if (this.dr.equals("whatsapp")){

            concreteWhatsApp w = new concreteWhatsApp();
            return w;

        } else if (this.dr.equals("telegram")) {


            concreteTelegram t = new concreteTelegram();
            return t;

        } else if (this.dr.equals("fleep")) {


            concreteTelegram f = new concreteTelegram();
            return f;
        }
        return null;
    }

    @Override
    public void show() {

        prodect x =this.sendMassge();
        String f = this.mg +"----> "+x.notificationMessge(this.dr,this.enter);
        System.out.println(f);
    }


}
