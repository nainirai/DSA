public class NumbersIncreasing {
    public static void NumbersIncreasingPattern(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        NumbersIncreasingPattern(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        int n = 5;
        NumbersIncreasingPattern(n);
    }
}
