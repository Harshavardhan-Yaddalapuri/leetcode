package hackerrank;

import java.util.Scanner;

public class Java_Loops_II {
        public static void main(String []argh){

            Scanner in = new Scanner(System.in);
            int sum = 0;
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                calculateSeries(a, b, n);
                System.out.println();
            }
            in.close();



        }

        static void calculateSeries(int a, int b, int n){


            for (int j = 0; j < n; j++) {
                a = a + ((int) Math.pow(2, j) * b);

                System.out.print(a + " ");
            }
        }
}
