import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();


//Test Methods
        if (n <0){
            System.out.println(SumOfPrimesWithDigit5Test.testSumOfPrimesWithDigit5_NegativeInput(n));
        }
        if (n == 0){
            System.out.println(SumOfPrimesWithDigit5Test.testSumOfPrimesWithDigit5_ZeroInput(n));
        }
        if (n < 100){
            System.out.println(SumOfPrimesWithDigit5Test.testSumOfPrimesWithDigit5_SmallInput(n));
        }
        if (n >= 100){
            System.out.println(SumOfPrimesWithDigit5Test.testSumOfPrimesWithDigit5_LargeInput(n));
        }
    }

}
