package java_condition_loop_problem_solution;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a character: ");
        char c = input.next().charAt(0);
        System.out.println("Character is  = "+c);

        if(c>='A' && c<='Z'){
            System.out.println(c+" is an upper case letter ");
        }

        else if(c>='a' && c<='z'){
            System.out.println(c+" is a lower case letter ");
        }

        else{
            System.out.println(c+" is not a Alphabets ");
        }


    }
}


