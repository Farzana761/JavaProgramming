package java_condition_loop_problem_solution;

import java.util.Scanner;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
      int n1, n2;
      System.out.println("Enter two number: ");
      Scanner r = new Scanner(System.in);
      n1 = r.nextInt();
      n2 = r.nextInt();

      for(int i= n1 ;i <=n2;i++) {

          int j;
          for (j = 2; j <= i; j++) {
              if (i % j == 0)
                  break;


          }
          if (i == j)
              System.out.println(j);

      }

    }

}


