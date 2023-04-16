import java.util.LinkedList;

public class Previous extends CommandBase {
    private LinkedList<String> a = CommandHistory.getAdd();



    public Previous(Control control) {
        super(control);
    }

    private String getPrevious(){

       if(CommandHistory.getCheckNext()){
           CommandHistory.setCount(CommandHistory.getCountTran()-1);
           CommandHistory.setCheckNext(false);
           String c1;
           if(CommandHistory.getCount()==0){
                c1 = this.control.previous(0);
               CommandHistory.setCountTran(CommandHistory.getCount());
               CommandHistory.setCount(a.size()-1);

           } else if (CommandHistory.getCount()<0) {
               c1 = this.control.previous(a.size()-1);
               CommandHistory.setCountTran(0);
               CommandHistory.setCount(a.size()-2);

           } else{
                c1 = this.control.previous(CommandHistory.getCount());
               CommandHistory.setCountTran(CommandHistory.getCount());
               CommandHistory.setCount(CommandHistory.getCount()-1);

           }
           return c1;


       }

       else {


           if ((CommandHistory.getCount() == 0)) {


               String c1 = this.control.previous(0);
               CommandHistory.setCountTran(CommandHistory.getCount());
               CommandHistory.setCount(a.size() - 1);


               return c1;

           } else {
               String c = this.control.previous(CommandHistory.getCount());
               CommandHistory.setCountTran(CommandHistory.getCount());
               CommandHistory.setCount(CommandHistory.getCount() - 1);


               return c;

           }

       }

    }

    @Override
    public String execute() {


        if (control.getMobileStatus()) {
            String pr = this.getPrevious();
            CommandHistory.setCountDelete(pr);
            return pr;
        }
        else {
            return "Run the mobile first";
        }
    }
}
