class Print_Odd_Numbers {
    public static void main(String[] args) {
        int n = 20; // Specify the range up to which you want to print odd numbers

        System.out.println("Odd numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}