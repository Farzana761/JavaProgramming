package java_condition_loop_problem_solution;



import java.util.Scanner;

public class SumofUserInput {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("Input a number");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            sum += num;
            System.out.println(sum);

            if (num == 'q') {
                break;
            }

        }
    }
}


