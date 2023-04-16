public class VolumeDownMo extends CommandBase {

    public VolumeDownMo(Control control) {
        super(control);
    }

    @Override
    public String execute() {



        if (control.getMobileStatus()) {

            if ((control.getVolume() > 0)) {
                return this.control.VolumeDown();
            } else {
                return "The sound has reached the lowest level!";
            }
        } else {

            return "Run the mobile first";
        }
    }
}
