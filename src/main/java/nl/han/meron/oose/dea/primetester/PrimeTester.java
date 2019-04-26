package nl.han.meron.oose.dea.primetester;

import org.apache.commons.math3.primes.Primes;

public class PrimeTester implements Runnable {

    private NumberUnderTest numberUnderTest;
    private int highestNumberToTest;

    public PrimeTester(NumberUnderTest numberUnderTest, int highestNumberToTest) {
        this.numberUnderTest = numberUnderTest;
        this.highestNumberToTest = highestNumberToTest;
    }

    private void startTesting() {

        while (true) {

            var number = numberUnderTest.getNumber();

            if (number > highestNumberToTest) {
                break;
            }

            var isPrime = Primes.isPrime(number);

            if (isPrime) {
                System.out.println(Thread.currentThread().getId() + " found a prime number: " + number);
            }
        }
    }

    public void run() {
        startTesting();
    }
}
