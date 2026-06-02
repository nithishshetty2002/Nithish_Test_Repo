public class VowelExtractor {
    public static void main(String[] args) {
        String input = "Hello, World! Welcome to Java.";
        
        // Remove everything except a, e, i, o, u (case-insensitive)
        String vowels = input.replaceAll("[^aeiouAEIOU]", "");
        
        System.out.println("Original String: " + input);
        System.out.println("Vowels extracted: " + vowels);
    }
}
