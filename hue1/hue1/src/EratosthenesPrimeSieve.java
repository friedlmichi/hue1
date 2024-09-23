import java.util.Arrays;

public class EratosthenesPrimeSieve implements PrimeSieve {
    private int upperLimit;
    private boolean[] primeSieve;

    public EratosthenesPrimeSieve(int upperLimit) {
        this.upperLimit = upperLimit;
        this.primeSieve = new boolean[upperLimit + 1];
        Arrays.fill(primeSieve, true);
        primeSieve[0] = primeSieve[1] = false;
    }
    private void runSieve() {
        for (int i = 2; i * i <= upperLimit; i++) {
            if (primeSieve[i]) {
                for (int j = i * i; j <= upperLimit; j += i) {
                    primeSieve[j] = false;
                }
            }
        }
    }

    @Override
    public boolean isPrime(int p) {
        if (p < 2 || p > upperLimit) {
            return false;
        }
        return primeSieve[p];
    }


}
