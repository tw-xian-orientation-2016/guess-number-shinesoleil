import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareNumberTest {
    @Test
    public void noRightNumber() {
        CompareNumber cn = new CompareNumber();
        assertEquals("0A0B", cn.compare(1234, 5678));
    }

    @Test
    public void fourRightNumberButWrongPlace() {
        CompareNumber cn = new CompareNumber();
        assertEquals("0A4B", cn.compare(1234, 4321));
    }

    @Test
    public void fourNumberRightPlace() {
        CompareNumber cn = new CompareNumber();
        assertEquals("4A0B", cn.compare(1234, 1234));
    }
}
