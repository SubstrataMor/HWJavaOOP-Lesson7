package calculator;

public class LogCalculableFactory implements ICalculableFactory{
    private final Loggable logger;

    public LogCalculableFactory(Loggable logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNumbers primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), this.logger);
    }
}
