import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        int result = calculator.add(2, 3); //"2+3=5"

        // Assert
        assertEquals(5, result);
    }
    @Test
    public void shouldReturnSubOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        int result = calculator.substract(4, 3); //"4-3=1"

        // Assert
        assertEquals(1, result);
    }
    @Test
    public void shouldReturnMulOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        int result = calculator.multiply(4, 3); //"4*3=12"

        // Assert
        assertEquals(12, result);
    }
    @Test
    public void shouldReturnDivOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        int result = calculator.divide(10, 5); //"10/5=2"

        // Assert
        assertEquals(2, result);
    }
}