public class DivDecorator extends OperationDecorator{
    protected float num;
    public DivDecorator(Operation o, float num) {

        super(o);
        this.num = num;
    }

    @Override
    public float operation() {
        float numOld = o.operation();
        return numOld / num;
    }
}
