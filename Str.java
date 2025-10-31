public class Str {
    public static void main(String[]args){
        String str = "   nibedita nayak   ";
        System.out.println("Original String: " + str);
        System.out.println("length of the String: " + str.length());
        System.out.println("Character at index 4: " + str.substring(2));
        System.out.println("Trimmed String: " + str.trim());
        System.out.println("Substring (2 to 8): " + str.replace('n', 'N'));
        System.out.println("Uppercase String: " + str.toUpperCase());
        System.out.println("Lowercase String: " + str.toLowerCase());
        System.out.println("stars with:"+ str.startsWith("nib"));
        System.out.println("character at index 4:"+str.charAt(4));
        System.out.println("index of b: " + str.indexOf('b'));
        System.out.println("is equal:"+ str.equals("   nibedita nayak   "));
        System.out.println("index of e:"+ str.indexOf('e'));
    }
    
}
