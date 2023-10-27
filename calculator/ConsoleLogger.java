package calculator;

public class ConsoleLogger implements Loggable{

    @Override
    public void log(String message) {
        System.out.println("Console Log:\t" + message);
    }
}