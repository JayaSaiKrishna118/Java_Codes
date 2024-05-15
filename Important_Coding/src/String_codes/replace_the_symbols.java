package String_codes;

public class replace_the_symbols {
    public static void main(String[] args) {
        String str = "kja@#nskd3$$%na";

        String plaintext = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Plain text: "+ plaintext);
    }

}
