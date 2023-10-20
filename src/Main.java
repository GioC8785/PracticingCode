
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printText();
        Scanner input = new Scanner(System.in);
        double numOfTimes = input.nextDouble();
        myMethod(numOfTimes);


    }

    public static void printText() {
        System.out.println("How many times do you want to print?");
    }

    public static void myMethod(double numOfTimes) {
        int i = 0;
        while (i < numOfTimes) {
            System.out.println("Greetings!");
            i++;
        }
        }

    }

















