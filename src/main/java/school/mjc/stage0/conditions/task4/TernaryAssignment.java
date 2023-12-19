package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result = (fist > second) ? 10 : -10;
    }
    public static void main(String[] args) {
        TernaryAssignment ternaryAssignment = new TernaryAssignment();
        ternaryAssignment.assignAndPrintBasedOnWhichBigger(15 ,8);
}
}
