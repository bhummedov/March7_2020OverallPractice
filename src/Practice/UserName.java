package Practice;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name :");
        String name = scanner.nextLine();
        System.out.println("enter password :");
        String password = scanner.nextLine();
        if (name.equals(name)) {
            if (password.equals(password)) {
                System.out.println("login was succesful");
            } else
                System.out.println("login unsuccessful");
        }

    }
}
