public class MulDecorator extends OperationDecorator {
    protected float num;
    public MulDecorator(Operation o, float num) {
        super(o);
        this.num = num;
    }

    @Override
    public float operation() {
        return super.operation() * num;
    }
}
