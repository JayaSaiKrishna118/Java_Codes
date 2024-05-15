package String_codes;

public class removewhitespaces {
    public static void main(String[] args) {
        String str1 = "j ajsn as ks l";
        String Normalword =  str1.replaceAll("\\s","");
        System.out.println("Normal word: "+Normalword);
    }
}
