public abstract class CommandBase {
    protected Control  control ;

    public CommandBase(Control control) {
        this.control = control;
    }

    public abstract String execute();
}
