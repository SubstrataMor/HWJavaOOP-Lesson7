package calculator;

public interface Calculable {
    Calculable sum(ComplexNumbers arg);
    Calculable multi(ComplexNumbers arg);
    Calculable div(ComplexNumbers arg);
    Calculable sub(ComplexNumbers arg);
    ComplexNumbers getResult();
}