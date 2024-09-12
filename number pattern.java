public class DisplayPattern {
    public static void main(String[] args) {
        int n = 5; // Define the size of the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
 