import Calculate.Calculate;
import Calculate.CalculateExprassion;
import Reader.Reader;
import java.util.List;

import Reader.ReadExpression;
import logger.Controller.LogerControllerCalculatte;
import logger.Controller.LogerController;

public class Main {
    public static void main(String[] args) {
        Reader r = new ReadExpression();
        LogerController logger = new LogerControllerCalculatte();
        Calculate calculate = new CalculateExprassion(logger);
        List<String> exp = r.read();
        float res = calculate.calculate(exp);
        System.out.println("Ответ: " + res);
        logger.printLog();
    }
}