public class OFF extends CommandBase {

    public OFF(Control control) {
        super(control);
    }

    @Override
    public String execute() {
        if(control.getMobileStatusLock()){
            return  this.control.OffM();}

        return "<--The mobile is currently turned off-->";}
}
