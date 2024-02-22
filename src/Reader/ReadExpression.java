import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadExpression implements Reader{
    @Override
    public List<String> read() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите математическое выражение без скобок, разделяя пробелами числа и знаки операций");
        System.out.print("Выражение: ");
        List<String> expression = Arrays.asList(in.nextLine().split(" "));
        int[] n = new int[10];
        int i =  n.length;;
    try{
        System.out.println();
    } catch (ArithmeticException  e) {
        throw new RuntimeException(e);
    }

        return  expression;
    }
}
