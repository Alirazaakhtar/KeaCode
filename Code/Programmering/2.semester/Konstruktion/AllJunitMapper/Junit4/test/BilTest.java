import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    @Test
    void doors() {
        //Arannge
        Bil bil = new Bil();
        //act
        int expected = 4;
        int actual = bil.doors(4);
        //Assert
        assertEquals(expected, actual);
    }
}