package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatest = (first >= second && first >= third) ? first : (second >= third) ? second : third;
        System.out.println("Greatest number: " + greatest);
    }

    public static void main(String[] args) {
        TernaryMaxNumberPrinter printer = new TernaryMaxNumberPrinter();
        printer.printGreatest(1, 0, -1);
    }
}
