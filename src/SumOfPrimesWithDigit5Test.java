public class SumOfPrimesWithDigit5Test {


    public static int testSumOfPrimesWithDigit5_NegativeInput(int n) {
        //assertEquals(0, result, "Sum of primes with digit 5 for negative input should be 0");
        return SumOfPrimesWithDigit5.sumOfPrimes(n);
    }


    public static int testSumOfPrimesWithDigit5_ZeroInput(int n) {
        //assertEquals(0, result, "Sum of primes with digit 5 for zero input should be 0");
        return SumOfPrimesWithDigit5.sumOfPrimes(n);
    }


    public static int testSumOfPrimesWithDigit5_SmallInput(int n) {
        //assertEquals(5 + 53, result, "Sum of primes with digit 5 for n=20 should be 58");
        return SumOfPrimesWithDigit5.sumOfPrimes(n);
    }

    public static int testSumOfPrimesWithDigit5_LargeInput(int n) {
        //assertEquals(5 + 53 + 59 + 503 + 509 + 593 + 599, result, "Sum of primes with digit 5 for n=1000 should be 2018");
        return SumOfPrimesWithDigit5.sumOfPrimes(n);
    }
}