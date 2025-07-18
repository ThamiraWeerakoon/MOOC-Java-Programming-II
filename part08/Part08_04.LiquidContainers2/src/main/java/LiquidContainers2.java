
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] inputArray = input.split(" ");
            if (inputArray[0].equals("add")) {
                int value = Integer.parseInt(inputArray[1]);
                firstContainer.add(value);
            } else if (inputArray[0].equals("move")) {
                int value = Integer.parseInt(inputArray[1]);
                if (value < firstContainer.contains()) {
                    firstContainer.remove(value);
                    secondContainer.add(value);
                } else {
                    int amount = firstContainer.contains();
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                }
            } else if (inputArray[0].equals("remove")) {
                int value = Integer.parseInt(inputArray[1]);
                secondContainer.remove(value);
            }
        }
    }

}
