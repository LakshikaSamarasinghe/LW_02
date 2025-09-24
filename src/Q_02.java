import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number :");
        String number = scanner.next();

            int count = number.length();
            System.out.print("Digits in the number :" + count);

    }
}