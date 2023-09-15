package seventh.strings;

public class ProcessStrings implements StringProcessor {

    //5,6 tasks
    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String extractOddPositionCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        ProcessStrings stringProcessor = new ProcessStrings();

        String inputString = "Hello, World!";

        int charCount = stringProcessor.countCharacters(inputString);
        System.out.println("Character count: " + charCount);

        String oddPositionChars = stringProcessor.extractOddPositionCharacters(inputString);
        System.out.println("Characters at odd positions: " + oddPositionChars);

        String reversedString = stringProcessor.reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}

