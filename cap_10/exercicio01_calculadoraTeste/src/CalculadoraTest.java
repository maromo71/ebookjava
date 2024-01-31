import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculadoraTest {
    @Test
    void subtrair() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.subtrair(5, 3));
    }
}
