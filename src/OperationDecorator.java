abstract public class OperationDecorator implements Operation {
    protected Operation o;

    public OperationDecorator(Operation o) {
        this.o = o;
    }

    @Override
    public float operation() {
        return 0;
    }


}
