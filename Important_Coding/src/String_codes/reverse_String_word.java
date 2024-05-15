package String_codes;

public class reverse_String_word {
    public static void main(String[] args) {
        String str1 = "java doc";
        //Here we are initializing the string
        String reversed = reverseString(str1);
        //Here we are creating new object to call and store the reverseString values
        System.out.println("original string : "+str1);
        //to print the original string
        System.out.println("reversed string: "+reversed);
        //to print the reversed string
    }
    //Creating a method to reverseStringword
    public static String reverseString(String words) {
        String wordArray[] = words.split(" ");
        //So basically this above lines job is to plit word by the space
        StringBuilder reverseWords = new StringBuilder();
        //Since string is a immutable, We use the stringbuilder to store all the reverse words
        //foreach loop is used to iterate through each and element and store it in a word
        for(String word : wordArray) {
            //creating a new object to store the reversed strings
            String reverseword = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseword = reverseword + word.charAt(i);
                //Here is our main logic. It will iterate through each loop and store it in the reverseword
            }
            reverseWords.append(reverseword).append(" ");
        }
        return reverseWords.toString().trim();
    }
}
