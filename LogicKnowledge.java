import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number1 : ");
        int a = in.nextInt();
        System.out.print("Enter the number2 : ");
        int b = in.nextInt();
        System.out.print("Enter the number3 : ");
        int c = in.nextInt();
        int result = greenTicket(a, b, c);

        System.out.println("Result: " + result);
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }
    public static int makeChocolate(int small, int large, int goal) {
return 0;
    }

}
