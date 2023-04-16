
import java.util.LinkedList;

public class NEXT extends CommandBase{

    private LinkedList<String> a1 = CommandHistory.getAdd();




    public NEXT(Control control) {
        super(control);
    }

    private String getNext(){

    if(CommandHistory.isCheckPrevious()){
        CommandHistory.setCount(CommandHistory.getCountTran()+1);
        CommandHistory.setCheckPrevious(false);

        String c1;
        if(CommandHistory.getCount()==a1.size()-1){
            c1 = this.control.Next(a1.size()-1);
            CommandHistory.setCountTran(CommandHistory.getCount());
            CommandHistory.setCount(0);
        }

        else if (CommandHistory.getCount()>a1.size()-1) {

            c1 = this.control.Next(0);
            CommandHistory.setCountTran(a1.size()-1);
            CommandHistory.setCount(1);

        }
        else{
            c1 = this.control.Next(CommandHistory.getCount());
            CommandHistory.setCountTran(CommandHistory.getCount());
            CommandHistory.setCount(CommandHistory.getCount()+1);

        }
        return c1;
    }


    else {
        if ((CommandHistory.getCount() == a1.size() - 1)) {
            String c1 = this.control.Next(CommandHistory.getCount());
            CommandHistory.setCountTran(CommandHistory.getCount());
            CommandHistory.setCount(0);


            return c1;
        } else {
            String c = this.control.Next(CommandHistory.getCount());
            CommandHistory.setCountTran(CommandHistory.getCount());
            CommandHistory.setCount(CommandHistory.getCount() + 1);

            return c;

            }
      }

    }

    @Override
    public String execute() {

        if (control.getMobileStatus()) {
            String n = this.getNext();
            CommandHistory.setCountDelete(n);
            return n;
        }
        else {
            return "Run the mobile first";
        }
    }
}
