
public class Assignment01Q03 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 0;
        int prev1 = 1;
        int prev2 = 1;
        int curr_fib_num = 0;
        for (int i = 0; i < x; i++) {
            if (i <= 1) {
                System.out.print(prev1);
                numOdd++;
            } 
            else {
                curr_fib_num = prev1 + prev2;
                System.out.print(curr_fib_num);
                prev1 = prev2;
                prev2 = curr_fib_num;
                if (curr_fib_num % 2 == 1) {
                    numOdd++;
                }
            }

            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space

            }
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
