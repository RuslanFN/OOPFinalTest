public class SumDecorator extends OperationDecorator{
    protected float num;
    public SumDecorator(Operation o, float num) {
        super(o);
        this.num = num;
    }

    @Override
    public float operation() {
        return super.operation() + num;
    }
}
