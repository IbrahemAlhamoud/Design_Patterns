public class Control {


    public String save(String text){

        Originator o = new Originator();
        CaretakerAction caretakerAction = new CaretakerAction(o);
        o.setText(text);
        caretakerAction.backup();
        String s = CommandHistory.getPrintMsg().get(0);
        CommandHistory.getPrintMsg().clear();

        return s;
    }

    public String ctrlZ(){

        Originator o = new Originator();
        CaretakerAction caretakerAction = new CaretakerAction(o);
        caretakerAction.ctrlZ();
        String s = CommandHistory.getPrintMsg().get(0);
        CommandHistory.getPrintMsg().clear();

        return s;
    }

    public String delete (){

        App.textArea.setText("");

        return "";
    }
}
