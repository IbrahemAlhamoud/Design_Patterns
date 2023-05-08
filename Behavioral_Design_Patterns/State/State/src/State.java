public abstract class State {

    protected MyMassage massage;

    public void setMassage(MyMassage massage) {
        this.massage = massage;
    }

    abstract public void nextStep();
}
