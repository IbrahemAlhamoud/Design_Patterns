public class ON extends CommandBase{

    public ON(Control control) {
        super(control);
    }

    @Override
    public String execute() {
        if(!(control.getMobileStatusLock())){
        return  this.control.OnM();}

    return "<--The mobile is in the current operating mode-->";}
}
