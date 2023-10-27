package calculator;

public class LogCalculator implements Calculable{
    private final Calculable decorated;
    private final Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(ComplexNumbers arg) {
        ComplexNumbers firstArg = decorated.getResult();
        logger.log(String.format("Значение калькулятора %s.\nНачало вызова метода сложения с параметром %s", firstArg, arg));
        Calculable result = decorated.sum(arg);
        logger.log("Вызов метода сложения произошел.");
        return result;
    }

    @Override
    public Calculable multi(ComplexNumbers arg) {
        ComplexNumbers firstArg = decorated.getResult();
        logger.log(String.format("Значение калькулятора %s.\nНачало вызова метода умножения с параметром %s", firstArg, arg));
        Calculable result = decorated.multi(arg);
        logger.log("Вызов метода умножения произошел.");
        return result;
    }

    @Override
    public Calculable div(ComplexNumbers arg) {
        ComplexNumbers firstArg = decorated.getResult();
        logger.log(String.format("Значение калькулятора %s.\n Начало вызова метода деления с параметром %s", firstArg, arg));
        Calculable result = decorated.div(arg);
        logger.log("Вызов метода деления произошел.");
        return result;
    }

    @Override
    public Calculable sub(ComplexNumbers arg) {
        ComplexNumbers firstArg = decorated.getResult();
        logger.log(String.format("Значение калькулятора %s.\n Начало вызова метода вычитания с параметром %s", firstArg, arg));
        Calculable result = decorated.sub(arg);
        logger.log("Вызов метода вычитания произошел.");
        return result;
    }

    @Override
    public ComplexNumbers getResult() {
        ComplexNumbers result = decorated.getResult();
        logger.log(String.format("Получение результата: %s", result));
        return result;
    }
}