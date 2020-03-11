package Practice;
import java.util.Scanner;
public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Does yur animal breathe yes or no:");
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("yes")) {
            System.out.println("Does the animal lay eggs?");
        } else{
                System.out.println("Fish");
            }
            String name2 = scanner.nextLine();
            if (name2.equalsIgnoreCase("yes")) {
                System.out.println("Bird");
            } else {
                System.out.println("Mammal");
            }

        }
    }

