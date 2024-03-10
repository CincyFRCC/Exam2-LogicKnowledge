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
        System.out.println("ChocolateResult: " + makeChocolate(4, 1, 9));
        System.out.println("ChocolateResult: " + makeChocolate(4, 1, 10));
        System.out.println("ChocolateResult: " + makeChocolate(4, 1, 7));
        System.out.println("ChocolateResult: " + makeChocolate(4, 2, 7));


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
        if (goal <= small + large * 5) {
            // int smallBarstoUse=goal-(large*5);
            int maxLargeBars = goal / 5;
            int usedLargeBars = Math.min(maxLargeBars, large);
            int smallBarstoUse = goal - (usedLargeBars * 5);
            return smallBarstoUse;
        } else {
            return -1;
        }
    }

}
