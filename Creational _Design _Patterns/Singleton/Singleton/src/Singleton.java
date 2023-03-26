public class Singleton {

    private String host ;
    private Integer port ;
    private String user;
    private  String password;

    private Singleton() {
        this.host = "192.168.1.1";
        this.port = 5001;
        this.user = "ibrahem";
        this.password = "ahmd199521l";
    }

    public  void getSingleton() {
        System.out.println("host: "+this.host+"<>port: "+this.port+"<> user: "+this.user+"<>password: "+this.password);
    }

    private static Singleton instance = null ;

    public static Singleton getInstance(){
        if (instance==null){
           return instance=new Singleton();}
        else{
            return instance ;
            }

    }

}
