public class Main {
    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        x.getSingleton();
        Singleton y= Singleton.getInstance();
        y.getSingleton();

    }
}