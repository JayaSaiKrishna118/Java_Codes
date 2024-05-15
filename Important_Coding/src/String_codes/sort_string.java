package String_codes;

import java.util.Scanner;

public class sort_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
         //String str = "rock";

         char ch[] = str.toCharArray();

         char temp;

         for(int i =0; i< ch.length; i++){
             for(int j = i+1; j< ch.length; j++){
                 if(ch[i]>ch[j]){

                     temp = ch[i];

                     ch[i] = ch[j];

                     ch[j] = temp;

                 }

             }
         }
        System.out.println(new String(ch));
    }
}
