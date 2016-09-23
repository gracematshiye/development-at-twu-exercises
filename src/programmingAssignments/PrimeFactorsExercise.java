package programmingAssignments;

import java.util.ArrayList;

public class PrimeFactorsExercise {
    public static void main(String[] args) {
        System.out.println(generateNumber(1));
        System.out.println(generateNumber(30));
        System.out.println(generateNumber(99));

    }

    public static ArrayList generateNumber(int n){
        ArrayList primeNumbers = new ArrayList();
        ArrayList primeFactors = new ArrayList();


        //generate prime numbers
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


        //Find the prime factor of variable 'n'
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
}
