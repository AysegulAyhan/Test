package Replit;

public class PrimeNumbers {

    public static void main(String[] args) {
        // code start here
        System.out.println(primeNum(20));
    }

    public static int primeNum(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        if (n<=1) flag=false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) flag = false;
        }
        return flag;
    }
}
