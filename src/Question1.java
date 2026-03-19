public class Question1 {
    public static void main(String[] args) {

        double num1 = 2.0;
        double num2 = 5.0;

        double percent = (num1 / num2) * 100;
        System.out.println(num1 + " is " + percent + "% of " + num2);

        percent = (num2 / num1) * 100;
        System.out.println(num2 + " is " + percent + "% of " + num1);

    }
}