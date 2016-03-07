import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class GuessIntegrationTest {
  Guess guess;

  @Before
  public void initialse() {
    Random random = mock(Random.class);
    when(random.nextInt(10)).thenReturn(1, 2, 3, 4);

    guess = new Guess(new AnswerGenerator(random), new CompareNumber());

  }

  @Test
  public void noRightNumber() {

    assertThat(guess.guess(("5678")), is("0A0B"));
  }

  @Test
  public void fourRightNumberButWrongPlace() {
    assertThat(guess.guess(("4321")), is("0A4B"));
  }

  @Test
  public void fourNumbeRightPlace() {
    assertThat(guess.guess(("1234")), is("4A0B"));
  }
}
