
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputArray = input.split(" ");
            if (inputArray[0].equals("add")) {
                int value = Integer.parseInt(inputArray[1]);
                if (value > 0) {
                    first += value;
                    if (first > 100) {
                        first = 100;
                    }
                }
            } else if (inputArray[0].equals("move")) {
                int value = Integer.parseInt(inputArray[1]);
                if ((value > 0) && (value < first)) {
                    first -= value;
                    second += value;
                } else if (value > 0) {
                    second += first;
                    first = 0;
                }
                if (second > 100) {
                    second = 100;
                }
            } else if (inputArray[0].equals("remove")) {
                int value = Integer.parseInt(inputArray[1]);
                if (value < second) {
                    second -= value;
                } else {
                    second = 0;
                }
            }

        }
    }

}
