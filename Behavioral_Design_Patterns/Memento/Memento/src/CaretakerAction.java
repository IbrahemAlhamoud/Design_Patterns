import java.util.LinkedList;
import java.util.Stack;

public class CaretakerAction {

    private  Originator originator;
    private Stack<MementoInterface> stateHistory = CommandHistory.getMementoInterfaceStack();

    public CaretakerAction(Originator originator) {
        this.originator = originator;
    }

    public void backup(){

        MementoInterface state = this.originator.snapShot();
        stateHistory.push(state);
        show("Backup Save");

    }

    public  void ctrlZ (){


        if (stateHistory.empty()) {

            System.out.println("you cant restore empty data");
            CommandHistory.getPrintMsg().add("you cant restore empty data");
        }
        else {
            MementoInterface state = stateHistory.pop();
            this.originator.ctrlZ_state(state);
            show("Restored");
        }
    }

    public void  show (String action){

        System.out.println(action + " ------> " + this.originator.getText());
        CommandHistory.getPrintMsg().add(action + " ------> " +this.originator.getText());
    }


}
