public class Fibonacci {
    public static int FiboNum(int n) {
        // base case
        if (n == 1 || n == 0) {
            return n;
        }
        int fn = FiboNum(n - 1);
        int sumfn = n + fn;
        return sumfn;

    }

    public static void main(String args[]) {
        int n = 8;
        System.out.println("Fibonacci number of " + n + "th is : " + FiboNum(n));

    }
}
