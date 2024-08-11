import java.util.Scanner;

class prime{
    //Ayesha Shaikh IT-B 117
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is a prime number:");
        int n = in.nextInt();
        
        if (isPrime(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static boolean isPrime(int n) {
        // Corner cases
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        
        // This is checked so that we can skip middle five numbers in the loop
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}

