public class DivDecorator extends OperationDecorator{
    protected float num;
    public DivDecorator(Operation o, float num) {
        super(o);
        this.num = num;
    }

    @Override
    public float operation() {
        if (num == 0){
            return super.operation();
        }
        return super.operation() + num;
    }
}
