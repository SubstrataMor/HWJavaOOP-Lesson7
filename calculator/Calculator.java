package calculator;

public class Calculator implements Calculable{
    private ComplexNumbers result;

    public Calculator(ComplexNumbers primaryArg) {
        this.result = primaryArg;
    }

    @Override
    public Calculable sum(ComplexNumbers arg) {
        this.result = this.result.addition(arg);
        return this;
    }

    @Override
    public Calculable multi(ComplexNumbers arg) {
        this.result = this.result.multiplication(arg);
        return this;
    }

    @Override
    public Calculable div(ComplexNumbers arg) {
        this.result = this.result.division(arg);
        return this;
    }

    @Override
    public Calculable sub(ComplexNumbers arg) {
        this.result = this.result.subtraction(arg);
        return this;
    }

    @Override
    public ComplexNumbers getResult() {
        return result;
    }
}