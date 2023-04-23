public class FactorialOfN {
    public static int FactorialOfNum(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = FactorialOfNum(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.print("Factorial of " + n + " is " + FactorialOfNum(n));

    }
}
