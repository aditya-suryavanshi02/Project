public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Specify the number of Fibonacci numbers to generate

        System.out.println("Fibonacci series up to " + n + " terms:");
        int first = 0, second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
