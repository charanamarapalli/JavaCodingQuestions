package recurssion;

public class Fibonacii {
    public static void main(String[] args) {
        int a = recfib(5);
        int b = loopfib(5);
        System.out.println(a + " " + b);
    }

    static int recfib(int n) {
        if (n <= 1) {
            return n;
        }
        return recfib(n - 1) + recfib(n - 2);
    }

    static int loopfib(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for (int i = 1; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}