import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testCasosBase() {
        assertEquals(0, fibonacci.calcular(0));
        assertEquals(1, fibonacci.calcular(1));
    }

    @Test
    public void testSequencia() {
        assertEquals(1, fibonacci.calcular(2));
        assertEquals(2, fibonacci.calcular(3));
        assertEquals(3, fibonacci.calcular(4));
        assertEquals(5, fibonacci.calcular(5));
        assertEquals(13, fibonacci.calcular(7));
    }

    @Test
    public void testExcecaoNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            fibonacci.calcular(-1);
        });
    }
}