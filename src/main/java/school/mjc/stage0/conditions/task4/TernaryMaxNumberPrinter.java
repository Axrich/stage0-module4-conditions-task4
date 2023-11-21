package school.mjc.stage0.conditions.task4;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int greatest = (first > second) ? first : second;
        System.out.println("The greatest number is: " + greatest);
    }

    public static void main(String[] args) {
        GreatestNumberPrinter printer = new GreatestNumberPrinter();
        printer.printGreatest(5, 10);
    }
}
