import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

public class GuessTest {
  @Test
  public void noRightNumber() {
    AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
    when(answerGenerator.generate()).thenReturn("1234");

    CompareNumber compareNumber = mock(CompareNumber.class);
    when(compareNumber.compare("1234", "1243")).thenReturn("2A2B");

    Guess guess = new Guess(answerGenerator, compareNumber);

    assertThat(guess.guess("1243"), is("2A2B"));
  }
}
