import java.util.HashMap;

public class Students {
    private boolean x = false;
    private HashMap add(){
     HashMap<String,String> m = new HashMap<>();
     m.put("malek","1111");
     m.put("ahmad","0000");
     m.put("ibrahem","2222");
     return m;
    }

    protected boolean eq(String s1 ,String s2){

        HashMap q = add();
        for (Object e:q.keySet()) {

            if((s1.trim().equals(e))&&(   s2.trim().equals(q.get(e)) ))
            {
                this.x= true;
            }
        }

          return this.x; }



}
