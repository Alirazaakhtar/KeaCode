import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void chechNO() {

        //Arrange
        Calculator calculator = new Calculator();
        //Act
        boolean expected = true;
        boolean actual = calculator.isEven(10);
        //Assert
        assertEquals(expected, actual);
    }

}