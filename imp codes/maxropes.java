
public class maxropes {

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        }
        return c;
    }

    public static int maxcut(int n, int a, int b, int c) {
        if (n == 0) {
            return 0;
        }

        if (n < 0) {
            return -1;
        }

        int result = max(maxcut(n - a, a, b, c), maxcut(n - b, a, b, c), maxcut(n - c, a, b, c));

        if (result == -1) {
            return -1;
        }

        return (result + 1);
    }

    public static void main(String[] args) {
        System.out.println(maxcut(23, 11, 2, 14));
    }
}
