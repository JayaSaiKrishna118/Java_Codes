package String_codes;

public class Reverse_String {
public static void main(String[] args){
    String str = "hello";
    //Approach 1
//    char charArray[] = str.toCharArray();
//    for(int i = charArray.length -1; i>=0; i--){
//        System.out.print(charArray[i]);
//    }
    //Approach 2
    for(int i = str.length()-1;i>=0;i--){
        System.out.print(str.charAt(i));

    }
}

}
