public class AlternateCharacters {
    public static void main(String[] args) {
        String input = "Example"; // Change this as needed
        for (int i = 0; i < input.length(); i += 2) {
            System.out.print(input.charAt(i));
        }
    }
}
 