
package student_spr22_tue;

import java.util.Scanner;




public class reverseWord {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner input =new Scanner(System.in);
        String word =input.nextLine();
        char[] myLetters =new char[word.length()];
       for(int i=0;i<word.length();i++){
           myLetters[i]=word.charAt(i);
       }
        
        for( int i=0;i<myLetters.length;i++){
            System.out.println(myLetters[i]);
        }
        System.out.println("in reverse order...");
         for( int i=myLetters.length-1;i>=0;i--){
            System.out.println(myLetters[i]);
        }
    }
}
