import java.util.ArrayList;
import java.util.List;

public class CalculateExprassion implements Calculate{
    protected float result;
    protected Operation o;
    protected logger logger;
    public CalculateExprassion() {
        this.result = 0;
        o = new BaseOperation();
        logger = new LoggerCalculate();
    }
    public CalculateExprassion(logger logger) {
        this.result = 0;
        o = new BaseOperation();
        this.logger = logger;
    }

    @Override
    public float calculate(List<String> exp) {
        List<String> Exp =  new ArrayList<>(exp);
        while (Exp.indexOf("*") != -1 || Exp.indexOf("/") != -1){
            int indMul = Exp.indexOf("*");
            int indDiv = Exp.indexOf("/");
            if (indMul < indDiv && indMul != -1 || indMul != -1 && indDiv == -1){
                Operation O = new SumDecorator(new BaseOperation(), Float.parseFloat(Exp.get(indMul - 1)));
                O = new MulDecorator(O, Float.parseFloat(Exp.get(indMul + 1)));
                logger.log("%s * %s".formatted(Exp.get(indMul - 1), Exp.get(indMul + 1)));
                Exp.remove(indMul-1);
                Exp.remove(indMul-1);
                Exp.remove(indMul-1);
                Exp.add((indMul - 1), String.valueOf(O.operation()));

            } else if (indDiv != -1){
                Operation O = new SumDecorator(new BaseOperation(), Float.parseFloat(Exp.get(indDiv - 1)));
                O = new DivDecorator(O, Float.parseFloat(Exp.get(indDiv + 1)));
                logger.log("%s / %s".formatted(Exp.get(indDiv - 1), Exp.get(indDiv + 1)));
                Exp.remove(indDiv-1);
                Exp.remove(indDiv-1);
                Exp.remove(indDiv-1);
                Exp.add((indDiv - 1), String.valueOf(O.operation()));
            }
        }
        int index = 1;

        if (Exp.size() != 0)
            o = new SumDecorator(o, Float.parseFloat(Exp.get(0)));
        while (index < Exp.size()){
           if (Exp.get(index).equals("+")){
               logger.log("%s + %s".formatted(o.operation(), Exp.get(index + 1)));
               o = new SumDecorator(o, Float.parseFloat(Exp.get(index + 1)));
           } else if (Exp.get(index).equals("-")) {
               logger.log("%s - %s".formatted(o.operation(), Exp.get(index + 1)));
               o = new SubDecorator(o, Float.parseFloat(Exp.get(index + 1)));
           }
           index++;
           index++;
        }
        result =  o.operation();
        return result;
    }
}
