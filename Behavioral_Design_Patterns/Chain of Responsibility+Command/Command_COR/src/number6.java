import java.util.Stack;

public class number6 extends CommandBase{

    private Stack<String> s = CommandHistory.getHistory();




    public number6(Control control) {
        super(control);
    }

    @Override
    public String execute() {
        if (control.getMobileStatus()) {

            if (control.isAddStatusLock()) {

                CommandHistory.setS2("");
                CommandHistory.setS("");
                control.setAddStatusLock(false);
            }
            s.push(this.control.num6());
            return CommandHistory.convert();

        }
        else {
            return "Run the mobile first";
        }
    }
}
