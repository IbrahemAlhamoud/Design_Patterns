public class Save extends CommandBase{
    public Save(Control control) {
        super(control);
    }

    @Override
    public String execute() {

        return this.control.save(App.textArea.getText());
    }
}
