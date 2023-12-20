package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int ternaryMaxNumberPrinterOfFirstAndSecondNumbers = first >= second ? first : second;
            if(ternaryMaxNumberPrinterOfFirstAndSecondNumbers >= first || ternaryMaxNumberPrinterOfFirstAndSecondNumbers >= second
                    || ternaryMaxNumberPrinterOfFirstAndSecondNumbers >= third) {
                System.out.println(ternaryMaxNumberPrinterOfFirstAndSecondNumbers);
            } else if (ternaryMaxNumberPrinterOfFirstAndSecondNumbers <= third) {
                System.out.println(third);
            }
    }
}
