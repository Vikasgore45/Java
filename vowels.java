import java.util.HashSet;
import java.util.Set;

public class VowelExtractor {
    public static void main(String[] args) {
        
        String input = "Hello, World!";
        
       
        displayVowels(input);
    }

    
    public static void displayVowels(String str) {
        
        Set<Character> vowels = new HashSet<>();
        
        
        str = str.toLowerCase();
        
        
        for (char ch : str.toCharArray()) {
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                
                vowels.add(ch);
            }
        }
        
        System.out.println("Vowels in the string: " + vowels);
    }
} 