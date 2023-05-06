package Part1;

public class Main
{
    public static int sum1toN(int n)
    {
        if (n == 1) {
            return 1;
        }
        else {
            return n + sum1toN(n - 1);
        }
    }
    public static double power(double x, int n)
    {
        if (n == 0) {
            return 1;
        }
        else {
            return x * power(x,n - 1);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(sum1toN(10));
        System.out.println(power(10,3));

    }
}