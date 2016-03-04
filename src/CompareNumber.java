public class CompareNumber {

    public String compare(int num, int inputNum) {

        String numStr = Integer.toString(num);
        String inputNumStr = Integer.toString(inputNum);
        int countA = 0;
        int countB = 0;

        for (int i = 0; i < inputNumStr.length(); i++) {
            if (numStr.charAt(i) == inputNumStr.charAt(i)) {
                countA++;
            } else if (numStr.indexOf(inputNumStr.charAt(i)) != -1) {
                countB++;
            }
        }

        return countA + "A" + countB + "B";
    }
}
