package programmingAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeFactorsExercise {
    public static void main(String[] args) {
//        System.out.println(generateNumber(1));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = input.nextInt();
        System.out.println("Your number: " + n + "\n" +generateNumber(n));


    }

    public static ArrayList generateNumber(int n){
        ArrayList primeNumbers = new ArrayList();
        ArrayList primeFactors = new ArrayList();


        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = i; j >= 1; j--) {
                if(i % j == 0) {
                    ++count;
                }
            }
            if(count == 2) {
                primeNumbers.add(i);
            }
        }


        for (int i = 0; i < primeNumbers.size(); i++) {

            if(n % (int)primeNumbers.get(i) == 0){
                n = n / (int)primeNumbers.get(i);
                primeFactors.add(primeNumbers.get(i));
            }

            if(n == 0) {
                i = primeNumbers.size();
            }

        }

        return primeFactors;
    }
    public static void getPrimeFactor(ArrayList list){


    }
}
