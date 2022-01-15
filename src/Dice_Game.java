import java.util.*;

public class Dice_Game {

    public static void six() {
        System.out.println("---------\n| *  * |\n| *  * |\n| *  * |\n---------");
    }

    public static void five() {
        System.out.println("---------\n| *  * |\n|  *   |\n| *  * |\n---------");
    }

    public static void four() {
        System.out.println("---------\n| *  * |\n|      |\n| *  * |\n---------");
    }

    public static void three() {
        System.out.println("---------\n|    * |\n|  *   |\n| *    |\n---------");
    }

    public static void two() {
        System.out.println("---------\n|    * |\n|      |\n| *    |\n---------");
    }

    public static void one() {
        System.out.println("---------\n| *  * |\n|  *   |\n|      |\n---------");
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice ");
        int ss = sc.nextInt();
        return ss;

    }

    public static int random() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int you = input();
        int computer = random();
        System.out.println("You");
        switch (you) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
            case 6:
                six();
                break;
        }
        System.out.println("\n");
        System.out.println("Computer");
        switch (computer) {
            case 1:
                one();
                break;
            case 2:
                two();
                break;
            case 3:
                three();
                break;
            case 4:
                four();
                break;
            case 5:
                five();
                break;
            case 6:
                six();
                break;
        }
        if (you > computer) {
            System.out.println("\nLucky! You won.");

        }
        if (computer > you) {
            System.out.println("You lost!");
        }
        if (you == computer) {
            System.err.println("Draw!");
        }
    }
}