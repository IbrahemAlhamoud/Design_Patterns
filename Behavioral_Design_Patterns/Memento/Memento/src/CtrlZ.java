public class CtrlZ extends CommandBase{
    public CtrlZ(Control control) {
        super(control);
    }

    @Override
    public String execute() {

        return this.control.ctrlZ();
    }
}
