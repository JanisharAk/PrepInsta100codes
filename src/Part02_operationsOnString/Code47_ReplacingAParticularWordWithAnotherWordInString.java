package Part02_operationsOnString;

public class Code47_ReplacingAParticularWordWithAnotherWordInString {
    /*

     */
    public static void main(String[] args) {
        String originalString = "Java is a powerful programming language. Java is widely used.";
        String wordToReplace = "Java";
        String replacementWord = "Python";

        // Using replace() method (case-sensitive)
        String updatedString = originalString.replace(wordToReplace, replacementWord);

        System.out.println("Original String: " + originalString);
        System.out.println("Updated String: " + updatedString);
    }
}
