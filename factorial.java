import java.util.Scanner;

class factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer to calculate its factorial");
        int n = in.nextInt();
        //Ayesha Shaikh IT-B 117
        if (n < 0) {
            System.out.println("Number should be non-negative.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}

