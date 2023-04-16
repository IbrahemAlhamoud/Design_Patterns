import java.util.LinkedList;

public class ADD extends CommandBase{

    private LinkedList<String> s =CommandHistory.getAdd();
    public ADD(Control control) {
        super(control);
    }

    @Override
    public String execute() {
        if (control.getMobileStatus()) {
            s.add(CommandHistory.getS2());
            System.out.println(s);
            return this.control.Add();
        }
        else {
            return "Run the mobile first";
        }
    }
}
