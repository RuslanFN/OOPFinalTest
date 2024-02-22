public class SumDecorator extends OperationDecorator{
    protected float num;

    public SumDecorator(Operation o, float num) {

        super(o);
        this.num = num;
    }

    @Override
    public float operation() {
        float numOld = o.operation();
        //logger.log("%f + %f".formatted(numOld, num));
        return numOld + num;
    }
}
