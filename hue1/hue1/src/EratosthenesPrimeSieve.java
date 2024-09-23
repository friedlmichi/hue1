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

}
