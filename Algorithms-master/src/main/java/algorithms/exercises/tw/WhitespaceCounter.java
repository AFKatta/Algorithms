package algorithms.exercises.tw;

public class WhitespaceCounter {
    public static void main(String[] args) {


        String input = "\ntable chair pen    bird       chicken ";

        int result = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' || input.charAt(i) == '\n') {
                result++;
            }
        }

        System.out.println(result);
    }
}
