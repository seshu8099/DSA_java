
public class recex {

    public static int fun(int n) {
        if (n == 0) {
            return 0;
        }
        fun(n - 1);
        System.out.print(n + " ");
        return 0;
    }

    public static void main(String[] args) {
        //int x = ;
        System.out.println(fun(16));
    }
}
