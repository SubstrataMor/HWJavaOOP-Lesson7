package calculator;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(ComplexNumbers firstArg) {
        return new Calculator(firstArg);
    }
}