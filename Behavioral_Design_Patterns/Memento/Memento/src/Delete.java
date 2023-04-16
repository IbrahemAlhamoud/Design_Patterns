public class Delete extends CommandBase{
    public Delete(Control control) {
        super(control);
    }

    @Override
    public String execute() {

        return this.control.delete();
    }
}
