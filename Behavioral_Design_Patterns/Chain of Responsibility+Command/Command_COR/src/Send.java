import java.util.LinkedList;
import java.util.Stack;

public class Send extends CommandBase{

    private LinkedList<String> s =CommandHistory.getAdd();




    public Send(Control control) {
        super(control);
    }

    @Override
    public String execute() {
        if (control.getMobileStatus()) {

            String num = CommandHistory.getCountDelete();
            String msg = App.textArea.getText();

            return this.control.send(num,msg);
        }
        else {
            return "Run the mobile first";
        }
    }
}
