import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test //Dodawanie
    public void shouldReturnSumOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result, "2+3=5");
    }

    @Test //Odejmowanie
    public void shouldReturnSubOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.substract(4, 3);

        // Assert
        assertEquals(1, result, "4-3=1");
    }

    @Test //Mnozenie
    public void shouldReturnMulOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.multiply(4, 3);

        // Assert
        assertEquals(12, result, "4*3=12");
    }

    @Test // Dzielenie
    public void shouldReturnDivOfTwoNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = calculator.divide(10, 5);

        // Assert
        assertEquals(2, result, "10/5=2");
    }

    @Test //ZeroDzielenie
    public void shouldThrowExceptionWhenDividingByZero() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
    }
    @Test
    public void shouldReturnSquareRootOfNumber() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sqrt(25), "sqrt(25) = 5");
    }

    @Test
    public void shouldThrowExceptionForNegativeSquareRoot() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.sqrt(-9), "Square root of negative number should throw ArithmeticException");
    }

    @Test
    public void shouldReturnPowerOfNumber() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.power(2, 3), "2^3 = 8");
    }

    @Test
    public void shouldReturnModuloOfTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.modulo(10, 3), "10 % 3 = 1");
    }

    @Test
    public void shouldThrowExceptionWhenModuloByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.modulo(10, 0), "Modulo by zero should throw ArithmeticException");
    }
}