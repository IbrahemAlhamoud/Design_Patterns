public class Originator {

    private String text ;




    public Originator() {
        this.text = "";
    }



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MementoInterface snapShot(){

        return new MementoConcrete(this);
    }


    public void ctrlZ_state (MementoInterface mementoInterface){

        Originator state = mementoInterface.getState();
        this.setText(state.getText());
    }
}
