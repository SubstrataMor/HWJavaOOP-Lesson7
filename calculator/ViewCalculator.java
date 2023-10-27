package calculator;

import java.util.Scanner;

public class ViewCalculator {
    private final Scanner iScanner = new Scanner(System.in);
    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
    public void run(){
        while (true){
            ComplexNumbers firstArg = promptComplexNumbers("Пеpвый аpгумент: ");
            Calculable calculator = calculableFactory.create(firstArg);
            ComplexNumbers arg = promptComplexNumbers("Втоpой аpгумент: ");
            String cmd = prompt("Введите команду (+, *, /, -, =): ");
            switch (cmd) {
                case ("+"):
                    calculator.sum(arg);
                    continue;
                case ("*"):
                    calculator.multi(arg);
                    continue;
                case ("/"):
                    calculator.div(arg);
                    continue;
                case ("-"):
                    calculator.sub(arg);
                    continue;
                case ("="):
                    System.out.printf("Pезультат: %s\n", calculator.getResult());
                    break;
                default:
                    System.out.println("Введите правильную команду или '=' для завершения");
                    continue;
                }
            String cmd2 = prompt("Еще посчитать (y/n)? ");
            if (cmd2.equals("n")) break;
        }
    }
    private String prompt(String msg){
        System.out.print(msg);
        return iScanner.nextLine();
    }
    private double promptDouble(String msg){
        System.out.print(msg);
        return Double.parseDouble(iScanner.nextLine());
    }
    private ComplexNumbers promptComplexNumbers(String msg){
        System.out.print(msg);
        double inputRe = promptDouble("Введите вещественную часть: ");
        double inputIm = promptDouble("Введите мнимую часть: ");
        return new ComplexNumbers(inputRe, inputIm);
    }
}