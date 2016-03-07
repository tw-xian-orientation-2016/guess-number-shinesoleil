public class CompareNumber {

  public String compare(String answer, String input) {

    int A = 0;
    int B = 0;

    for (int i = 0; i < input.length(); i++) {
      if (answer.charAt(i) == input.charAt(i)) {
        A++;
      } else if (answer.indexOf(input.charAt(i)) != -1) {
        B++;
      }
    }

    return A + "A" + B + "B";
  }
}
