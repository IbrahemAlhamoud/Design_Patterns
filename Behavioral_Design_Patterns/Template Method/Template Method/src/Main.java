public class Main {
    public static void main(String[] args) {

       countryHouse countryHouse = new countryHouse();
       System.out.println("<------country House------>");
       countryHouse.prepareHouse();

       System.out.println("============================================");

       houseInTheCity houseInTheCity = new houseInTheCity();
        System.out.println("<------house In The City------>");
       houseInTheCity.prepareHouse();

    }
}