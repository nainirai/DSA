public class NaturalSum {
    public static int SumNum(int n) {
        if (n == 1) {
            return 1;
        }
        SumNum(n - 1);
        int fn = n + SumNum(n - 1);
        return fn;
    }

    public static void main(String args[]) {
        int n = 15;
        System.out.print("Sum of " + n + " Natural numbers is: " + SumNum(n));
    }
}
