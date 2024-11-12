
class Main {

    public static int sumOfProductOfDigits(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }

        return (n1 % 10) * (n2 % 10) + sumOfProductOfDigits(n1 / 10, n2 / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfProductOfDigits(36, 67));
    }
}
