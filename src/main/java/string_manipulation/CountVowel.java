package string_manipulation;
//Write a program that will count how many vowels in the given string:
//        Input: "roadtosdet"
//        Output: 4
import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+count);
    }
}
