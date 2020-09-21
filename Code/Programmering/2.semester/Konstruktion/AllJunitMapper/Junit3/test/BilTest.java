import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    @Test
    void door() {
        //Arrange
        Bil bil = new Bil();
        //ACT
        int expected = 4;
        int actual = bil.door(4);
        //Assert
        assertEquals(expected, actual);
    }
}