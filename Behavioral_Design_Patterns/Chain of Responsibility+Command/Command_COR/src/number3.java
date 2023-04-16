import java.util.Stack;

public class number3 extends CommandBase{

    private Stack<String> s = CommandHistory.getHistory();




    public number3(Control control) {
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
            s.push(this.control.num3());
            return CommandHistory.convert();

        }
        else {
            return "Run the mobile first";
        }
    }
}

