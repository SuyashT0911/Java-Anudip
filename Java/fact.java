public class fact {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial is " + factorial(num));
    }

    public static int factorial(int n) {
        int fact = 1, i;
        for (i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }
}
