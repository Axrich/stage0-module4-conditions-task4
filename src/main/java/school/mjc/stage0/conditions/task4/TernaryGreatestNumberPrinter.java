package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first >= second && first >= third) {
            System.out.println("The greatest number is: " + first);
        } else if (second >= first && second >= third) {
            System.out.println("The greatest number is: " + second);
        } else {
            System.out.println("The greatest number is: " + third);
        }
    }

    public static void main(String[] args) {
        MaxNumberPrinter printer = new MaxNumberPrinter();
        printer.printGreatest(1, 0, -1);
    }
}
