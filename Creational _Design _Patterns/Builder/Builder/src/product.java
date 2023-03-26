import java.util.ArrayList;

public class product {

    ArrayList<String> product = new ArrayList<String>();

    public void addProduct(String prod){

        product.add(prod);
    }

    public void getproduct(){
        for (String p:this.product) {

            System.out.println(p);
        }
        System.out.println("Ending.....");
    }
}
