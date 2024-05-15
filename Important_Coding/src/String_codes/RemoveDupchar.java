package String_codes;

public class RemoveDupchar {
    public static void main(String[] args) {
        String str = "Programming";
        StringBuilder sb1 = new StringBuilder();
        str.chars().distinct().forEach(c -> sb1.append((char)c));
        System.out.println(sb1);
    }
}
