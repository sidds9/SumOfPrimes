public class SumOfPrimesWithDigit5 {
    // Checks
    public static boolean isPrime(int num){
        if (num <2){
            return false;
        }
        for (int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean containsDigits(int num){
        return String.valueOf(num).contains("5");
    }

    public static int sumOfPrimes(int n){
        int primeSum = 0;
        for (int i = 2; i <= n; i++){
            if (isPrime(i) && containsDigits(i)){
                primeSum +=i;
            }
        }
        return primeSum;
    }


}
