import java.util.Stack;

public class number4 extends CommandBase{

    private Stack<String> s = CommandHistory.getHistory();




    public number4(Control control) {
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
            s.push(this.control.num4());
            return CommandHistory.convert();

        }
        else {
            return "Run the mobile first";
        }
    }
}
