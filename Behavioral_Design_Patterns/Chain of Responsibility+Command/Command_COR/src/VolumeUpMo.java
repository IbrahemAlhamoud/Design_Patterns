public class VolumeUpMo extends CommandBase {

    public VolumeUpMo(Control control) {
        super(control);
    }

    @Override
    public String execute() {



        if (control.getMobileStatus()) {

            if (control.getVolume() < 7) {
                return this.control.VolumeUp();
            } else {
                return "The sound has reached the highest level!";
            }
        } else {
            return "Run the mobile first";
        }

    }
}
