public class MementoConcrete implements  MementoInterface{

    private Originator originator;

    public MementoConcrete(Originator originator) {
        this.originator = originator;
    }

    @Override
    public Originator getState() {
        return this.originator;
    }


}
