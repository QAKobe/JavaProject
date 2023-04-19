package projectTasks;

public class PrimeNumbers {

    public static void main(String[] args) {

        /*
        Create a method that should return true or false
        Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
        prime numbers can’t be divided by other numbers than itself or 1.
        For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
         */


        boolean b = primeNumber1(17);
        System.out.println(b);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean primeNumber(int num){

        if(num <= 1) {
            return false; // 1 and below are not prime
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false; //if number is divisible by any number other than 1 or itself, it's not prime
            }
        }
        return true;
    }

    public static boolean primeNumber1(int num){

        if(num <= 1) {
            return false; // 1 and below are not prime
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false; //if number is divisible by any number other than 1 or itself, it's not prime
            }
        }
        return true;
    }



}













