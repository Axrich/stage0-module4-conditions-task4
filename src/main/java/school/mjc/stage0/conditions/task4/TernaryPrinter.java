package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        if ( first >= second) {
        System.out.println((first > second) ? "first" : "second");
    } else {
            System.out.println("Second number is bigger than first " + second);
                }
    }

    public static void main(String[] args) {
        TernaryPrinter printer = new TernaryPrinter();
        printer.printWhichIsBigger(5, 20); 
    }
}
