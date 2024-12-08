public class RecursiveStudent03 {

    static int factorialrecursive(int n) {
        if (n==1) {
            return 1;
        } else {
            return n*factorialrecursive(n-1);
        }
    }

        static int factorialIterative(int n) {
            int factorial = 1;
            for(int i = n; i >= 1; i--) {
                factorial = factorial*i;
            }
            return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println(factorialrecursive(5));
        System.out.println(factorialrecursive(5));
        }
    }
