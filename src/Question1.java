public class Question1 {
    public static void main(String[] args) {

        double num1 = 2.0;
        double num2 = 5.0;

        computePercent(num1, num2);
        computePercent(num2, num1);

    }
    public static void computePercent(double first, double second) {
        double percent = (first / second) * 100;
        System.out.println(first + " is " + percent + "% of " + second);

    }
}
