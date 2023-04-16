import java.util.LinkedList;

public class Delete extends CommandBase{

    private LinkedList<String> s =CommandHistory.getAdd();
    public Delete(Control control) {
        super(control);
    }

    @Override
    public String execute() {

        if (control.getMobileStatus()) {
            Integer del = s.indexOf(CommandHistory.getCountDelete());
            System.out.println(del);
            return this.control.Delete(del);
        }
        else {
            return "Run the mobile first";
        }
    }
}
