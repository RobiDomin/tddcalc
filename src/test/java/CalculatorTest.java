import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        double result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result, "2+3=5");
    }
    @Test
    public void shouldReturnSubOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        double result = calculator.substract(4, 3);

        // Assert
        assertEquals(1, result, "4-3=1");
    }
    @Test
    public void shouldReturnMulOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        double result = calculator.multiply(4, 3);

        // Assert
        assertEquals(12, result, "4*3=12");
    }
    @Test
    public void shouldReturnDivOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator(); // Klasa jeszcze nie istnieje

        // Act
        double result = calculator.divide(10, 5);

        // Assert
        assertEquals(2, result, "10/5=2");
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZero() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
    }
}