import java.util.Random;

public class AnswerGenerator {
  Random random;

  public AnswerGenerator(Random random) {
    this.random = random;
  }

  public String generate() {
    String answer = "";

    while (answer.length() < 4) {
      String newDigit = Integer.toString(this.random.nextInt(10));
      if (answer.indexOf(newDigit) == -1) {
        answer += newDigit;
      }
    }

    return answer;
  }
}
