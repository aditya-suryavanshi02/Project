public class prime1 {
    public static void main(String[] args) {
        int n = 100; // Specify the range up to which you want to print prime numbers

        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i*i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }  
        
    }
    public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } 
}
