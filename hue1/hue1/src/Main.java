
    public class Main {
        public static void main(String[] args) {
            int upperLimit = 100;
            EratosthenesPrimeSieve sieve = new EratosthenesPrimeSieve(upperLimit);

            sieve.printPrimes();

            System.out.println("Ist 7 eine Primzahl? " + sieve.isPrime(7));
            System.out.println("Ist 15 eine Primzahl? " + sieve.isPrime(15));
        }
    }

