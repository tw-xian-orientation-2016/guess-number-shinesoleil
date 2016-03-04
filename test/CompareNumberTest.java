import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompareNumberTest {
  CompareNumber cn;

  @Before
  public void initialise() {
    cn = new CompareNumber();
  }

  @Test
  public void noRightNumber() {
    assertEquals("0A0B", cn.compare(1234, 5678));
  }

  @Test
  public void fourRightNumberButWrongPlace() {
    assertEquals("0A4B", cn.compare(1234, 4321));
  }

  @Test
  public void fourNumberRightPlace() {
    assertEquals("4A0B", cn.compare(1234, 1234));
  }
}
